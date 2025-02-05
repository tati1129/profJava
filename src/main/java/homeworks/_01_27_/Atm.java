package homeworks._01_27_;


public class Atm {

    private Card card;

    // Метод для "вставки" карты в банкомат (можно передавать пин-код сразу)
    public boolean setCard(CreditCard card, int enteredPin) {
        if (card.validatePin(enteredPin)) {
            this.card = card;
            return true;
        } else {
            System.out.println("Invalid PIN.");
            return false;
        }
    }

    // Метод для снятия денег
    public void extractMoney(double money) {
        if (card == null) {
            System.out.println("No card inserted.");
            return;
        }
        card.extractMoney(money);
    }

    // Метод для пополнения счета
    public void addMoney(double amount) {
        if (card == null) {
            System.out.println("No card inserted.");
            return;
        }
        card.addMoney(amount);
    }

    // Метод для проверки баланса
    public void checkBalance() {
        if (card == null) {
            System.out.println("No card inserted.");
            return;
        }
        card.checkBalance();
    }

    // Метод для извлечения карты
    public void ejectCard() {
        if (card == null) {
            System.out.println("No card to eject.");
            return;
        }
        System.out.println("Card ejected: " + card.owner);
        card = null;
    }

}

