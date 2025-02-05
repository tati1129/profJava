package homeworks._01_27;


public class DebitCard extends Card {

    public DebitCard(String userName, double balance, int pinKod) {
        super(userName, balance, pinKod);
    }

    @Override
    public void extractMoney(double money) {
        if (money > getBalance()) {
            System.out.println("Insufficient funds. Cannot withdraw " + money);
        } else {
            setBalance(getBalance() - money);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        }
    }


}
