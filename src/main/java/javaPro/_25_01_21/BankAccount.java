package javaPro._25_01_21;

public class BankAccount {

    private int balance;
    private int hold;

    public BankAccount(int balance, int hold) {
        this.balance = balance;
        this.hold = hold;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getHold() {
        return hold;
    }

    public void setHold(int hold) {
        this.hold = hold;
    }
}
