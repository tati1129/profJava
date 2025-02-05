package homeworks._01_27;

public class CreditCard extends Card {

    private double creditLimit;

    public CreditCard(String userName, double balance, int pinKod, double creditLimit) {
        super(userName, balance, pinKod);
        this.creditLimit = creditLimit;
    }

    public CreditCard(String userName, double balance, int pinKod) {
        super(userName, balance, pinKod);
        this.creditLimit = 50000;
    }

    @Override
    public void extractMoney(double money) {
        double availableValue = getBalance() + creditLimit;
        if (money > availableValue) {
            System.out.println("Transaction denied. Exceeds credit limit.");
        } else {
            double newBalance = getBalance() - money;
            setBalance(newBalance);
            if (newBalance < 0) {
                System.out.println("Withdrawal successful. Your debt: " + (newBalance));
            } else {
                System.out.println("Withdrawal successful. New balance: " + getBalance());
            }
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }


}