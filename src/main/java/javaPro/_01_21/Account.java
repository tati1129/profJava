package javaPro._01_21;

public class Account {

    private int balance;
    private int hold;

    public Account(int balance, int hold) {
        this.balance = balance;
        this.hold = hold;
    }

    public int getBalance() {
        return balance;
    }

    public int getHold() {
        return hold;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", hold=" + hold +
                '}';
    }

    public  void makePay(int amount){
        if (amount < 0){
            throw new IllegalArgumentException("amount не может быть отрицательной");
        }
        if (amount > balance){
            throw new IllegalArgumentException("не достаточно средств");
        }
       balance -= amount;
        hold += amount;


    }

}
