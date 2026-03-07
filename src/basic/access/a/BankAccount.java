package basic.access.a;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // 입금: public
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 출금: public
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합다.");
        }
    }

    // 잔액조회: public
    public int getBalance() {
        return balance;
    }

    // 액수 검증로직: private
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

}