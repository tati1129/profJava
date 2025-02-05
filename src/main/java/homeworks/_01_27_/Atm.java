package homeworks._01_27_;


import homeworks._01_27_.exception.InvalidPinException;
import homeworks._01_27_.exception.NoCardInsertedException;

public class Atm {

    private Card card;


    // Метод для проверки, вставлена ли карта
    public void checkCardInserted() throws NoCardInsertedException {
        if (card == null) {
            throw new NoCardInsertedException("No card inserted.");
        }
    }

    // Метод для "вставки" карты в банкомат (можно передавать пин-код сразу)
    public boolean setCard(CreditCard card, int enteredPin) throws InvalidPinException {
            card.validatePin(enteredPin);  // Вызываем метод валидации пин-кода, который может выбросить исключение
            this.card = card;
            return true;
    }

    // Метод для снятия денег
    public void extractMoney(double money) throws NoCardInsertedException{
        checkCardInserted();
        card.extractMoney(money);
    }

    // Метод для пополнения счета
    public void addMoney(double amount) throws NoCardInsertedException {
        checkCardInserted();
        card.addMoney(amount);
    }

    // Метод для проверки баланса
    public void checkBalance() throws NoCardInsertedException{
        checkCardInserted();
        card.checkBalance();
    }

    // Метод для извлечения карты
    public void ejectCard() throws NoCardInsertedException{
        checkCardInserted();
        System.out.println("Card ejected: " + card.owner);
        card = null;
    }

}

