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


//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void addMoney(double money) {
        if (money > 0){
            balance += money;
            System.out.println("Deposited: " + money);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }

    ;

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    ;

//    public void balanceInCurrency(double rate, String currency) {
//        if (rate > 0) {
//            double currentValue = Math.round(getBalance() * rate * 100.0) / 100.0;
//            System.out.println("Your balance in  " + currency + " : " + currentValue);
//        } else {
//            throw new IllegalArgumentException("Incorrect rate");
//        }
//
//    }

    public abstract void extractMoney(double money);
}