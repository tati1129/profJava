package homeworks._01_27_;

import homeworks._01_27_.exception.InvalidDepositAmountException;
import homeworks._01_27_.exception.InvalidPinException;

public abstract class Card {

    protected String cardType;
    protected String owner;
    protected double balance;
    private int pinCod;


    public Card(String owner, double balance, int pinCod, String cardType) {
        this.owner = owner;
        this.balance = balance;
        this.pinCod = pinCod;
        this.cardType = cardType;

    }

    protected void validatePin(int enteredPin) throws InvalidPinException {
        if (this.pinCod != enteredPin) {
            throw new InvalidPinException("Invalid PIN");
        }
    }

    public void addMoney(double money) {
        if (money <= 0) {
            throw new InvalidDepositAmountException("Invalid deposit amount: " + money);
        }
        balance += money;
        System.out.println("Deposited: " + money);
    }


    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    @Override
    public String toString() {
        return cardType + " карта владельца: " + owner;
    }

    public abstract void extractMoney(double money);
}