package homeworks._01_27_;


import homeworks._01_27_.exception.InvalidPinException;

public class CreditCard extends Card {

    private int pin;
    private double creditLimit;

    public CreditCard(String owner, double balance, int pinKod, double creditLimit) {
        super(owner, balance, pinKod);
        this.creditLimit = creditLimit;
    }

    public CreditCard(String owner, double balance, int pinKod) {
        super(owner, balance, pinKod);
        this.creditLimit = 50000;
    }

    @Override
    public void validatePin(int enteredPin) throws InvalidPinException {
        super.validatePin(enteredPin);
    }

    @Override
    public void extractMoney(double money) {
        double availableValue = balance + creditLimit;
        if (money > availableValue) {
            System.out.println("Transaction denied. Exceeds credit limit.");
        } else {
            balance -= money;

            if (balance < 0) {
                System.out.println("Withdrawal successful. Your debt: " + (-balance));
            } else {
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
        }
    }


}

