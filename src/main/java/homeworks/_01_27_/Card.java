package homeworks._01_27_;

public abstract class Card {

    protected String owner;
    protected double balance;
    private int pinCod;


    public Card(String owner, double balance, int pinCod) {
        this.owner = owner;
        this.balance = balance;
        this.pinCod = pinCod;

    }

    protected boolean validatePin(int enteredPin) {
        return this.pinCod == enteredPin;
    }

    public void addMoney(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Deposited: " + money);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }


    public abstract void extractMoney(double money);
}