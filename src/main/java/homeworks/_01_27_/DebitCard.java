package homeworks._01_27_;

import homeworks._01_27_.exception.InsufficientFundsException;

public class DebitCard extends Card {

    public DebitCard(String owner, double balance, int pinKod) {
        super(owner, balance, pinKod);
    }

    @Override
    public void extractMoney(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Withdrawal: " + money);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw " + money);

        }
    }


}
