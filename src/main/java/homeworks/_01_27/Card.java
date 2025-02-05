package homeworks._01_27;

public abstract class Card {

    protected String userName;
    protected double balance;
    private int pinCod;


    public static final CreditCard creditCardUser1;
    public static final DebitCard debitCardUser1;
    public static final CreditCard creditCardUser2;
    public static final DebitCard debitCardUser2;

    static {
        creditCardUser1 = new CreditCard("Antony", 2000.0, 1111);
        debitCardUser1 = new DebitCard("Antony", 3500.0, 1111);

        creditCardUser2 = new CreditCard("Mary", 3000.0, 2222);
        debitCardUser2 = new DebitCard("Mary", 15000.0, 2222);
    }

    public Card(String userName, double balance, int pinCod) {
        this.userName = userName;
        this.balance = balance;
        this.pinCod = pinCod;

    }

    public boolean validatePin(int enteredPin) {
        return this.pinCod == enteredPin;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addMoney(double money) {
        setBalance(getBalance() + money);
        System.out.println("Added to the account: " + money);
    }

    ;

    public void checkBalance() {
        double balance = getBalance();
        System.out.println("Current balance: " + balance);
    }

    ;

    public void balanceInCurrency(double rate, String currency) {
        if (rate > 0) {
            double currentValue = Math.round(getBalance() * rate * 100.0) / 100.0;
            System.out.println("Your balance in  " + currency + " : " + currentValue);
        } else {
            throw new IllegalArgumentException("Incorrect rate");
        }

    }

    public abstract void extractMoney(double money);
}