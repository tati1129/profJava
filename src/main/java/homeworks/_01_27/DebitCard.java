package homeworks._01_27;


public class DebitCard extends Card {

    public DebitCard(String userName, double balance, int pinCod) {
        super(userName, balance, pinCod);
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