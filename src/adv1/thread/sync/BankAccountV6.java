package adv1.thread.sync;

import static adv1.util.MyLogger.log;
import static adv1.util.ThreadUtils.sleep;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV6 implements BankAccount {

    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankAccountV6(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        // lock.tryLock(long time, TimeUnit unit) :
        // 락 획득 대기 time(단위는 unit)만큼 한번 해보고, 안되면 포기(false 반환), 근데 대기중에 인터럽트 걸면 예외 터뜨리고 대기 종료(포기)할게.
        try {
            if (!lock.tryLock(500, TimeUnit.MICROSECONDS)) { //이 블럭은 락 획득을 실패했다는 의미이므로 로그 찍고 바로 return해버림.
                log("[진입실패] 이미 처리중인 작업이 있습니다.");
                return false;
            }
        } catch (InterruptedException e) {
            log("[진입실패] 락 획득 대기 중 외부에서 인터럽트 수신하였습니다.");
            throw new RuntimeException(e);
        }

        // 여기까지 왔으면 락 획득한거임. 임계영역 시작.
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
            lock.unlock(); // 락 해제 필수. 임계영역 끝.
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
