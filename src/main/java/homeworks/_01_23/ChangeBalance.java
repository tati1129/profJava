package homeworks._01_23;

public interface ChangeBalance {

    default void addMoney(Card card, double money) {
        card.setBalance(card.getBalance() + money);
        System.out.println("Added to the account: " + money);
    };

    default void extractMoney(Card card, double money) {
        if (card.getBalance() < money) {
            throw new IllegalArgumentException("Not enought money on balance");
        }
        card.setBalance(card.getBalance() - money);
        System.out.println("Withdrawn from the account:" + money);
    };

    default void checkBalance(Card card) {
        double balance = card.getBalance();
        System.out.println("Current balance: " + balance);
    };


}
