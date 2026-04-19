package adv1.thread.sync;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV4 implements BankAccount {

    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankAccountV4(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        // ReentrantLock 이용하여 lock을 걸기 -> synchronized 처럼 임계영역 처음과 끝에 락을 걸고 해제하면 된다!
        // 근데 추가로, 락을 들고 임계영역에서 작업을 하다가 예외가 터지면 락 반납 안하고 메서드 밖으로 튕겨져 나갈 수 있으니,
        // 반드시 try-finally를 사용해서 finally 절에서 락을 해제할 수 있게 한다!!
        // (안하면 lock.lock()으로 무기한 대기하던 다른 스레드 평생 락 획득 못하고 기다릴수도 있음.)
        // (특히 Lock.lock()으로 대기중이었으면 인터럽트도 안먹힘.)
        lock.lock();
        try {
            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
            if (balance < amount) {
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }

            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000);
            balance = balance - amount;
            log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);

        } finally {
            lock.unlock(); // ReentrantLock 이용하여 락 해제, 대기중인 어떤 스레드가 락 가져감.
        }

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        lock.lock(); // ReentrantLock 이용하여 lock을 걸기
        try {
            return balance;
        } finally {
            lock.unlock(); // ReentrantLock 이용하여 락 해제
        }
    }
}
