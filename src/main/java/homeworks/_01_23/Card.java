package homeworks._01_23;

public class Card {

    private String userName;
    private double balance;

    public Card(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public Card(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    };

    public void extractMoney(double money) {
        if (getBalance() < money) {
            throw new IllegalArgumentException("Not enought money on balance");
        }
        setBalance(getBalance() - money);
        System.out.println("Withdrawn from the account:" + money);
    };

  public void checkBalance() {
        double balance = getBalance();
        System.out.println("Current balance: " + balance);
    };

  public void balanceInCurrency( double rate, String currency) {
      if (rate > 0) {
          double currentValue = Math.round(getBalance() * rate * 100.0) / 100.0;
          System.out.println("Your balance in  " + currency + " : " + currentValue);
      } else {
          throw new IllegalArgumentException("Incorrect rate");
      }

  }
}