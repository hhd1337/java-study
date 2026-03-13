package basic.poly.ex.pay0;

public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public boolean deposit(int amount) {
        if (validateAmountPositive(amount)) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(int amount) {
        if (validateAmountPositive(amount) && validateBalanceEnough(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    private boolean validateAmountPositive(int amount) {
        return amount > 0;
    }

    private boolean validateBalanceEnough(int amount) {
        return balance >= amount;
    }
}
