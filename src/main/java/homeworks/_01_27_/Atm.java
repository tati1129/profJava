package homeworks._01_27_;


import homeworks._01_27_.exception.InvalidPinException;

public class Atm {

    private Card card;


    // Метод для "вставки" карты в банкомат (можно передавать пин-код сразу)
    public boolean setCard(Card card, int enteredPin){
            card.validatePin(enteredPin);  // Вызываем метод валидации пин-кода, который может выбросить исключение
            this.card = card;
            return true;
    }

    // Метод для снятия денег
    public void extractMoney(double money){
        card.extractMoney(money);
    }

    // Метод для пополнения счета
    public void addMoney(double amount) {
        card.addMoney(amount);
    }

    // Метод для проверки баланса
    public void checkBalance(){
        card.checkBalance();
    }

    // Метод для извлечения карты
    public void ejectCard(){
        System.out.println("Card ejected: " + card.toString());
        card = null;
    }

}

