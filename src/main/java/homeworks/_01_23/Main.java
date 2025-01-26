package homeworks._01_23;

/*
Создайте класс Карта, которая содержит имя пользователя и баланс
Сделайте несколько конструкторов (перегрузка) для:
-создания карты с именем пользователя и балансом
-создания карты с именем пользователя
Сделайте методы для пополнения/снятия/отображения баланса
Добавьте дополнительный метод для отображения баланса в различных валютах, передавая курс валюты
В методе мэйн проверить работу всех методов класса Card


 */
public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Ivan Petrov", 4000);
        Card card2 = new Card("Inna Sue");



        card1.addMoney(500);
        card1.extractMoney( 200);
        card2.checkBalance();

        String euro = "EURO";
        String usd = "USD";
        double rateUSD = 42.75;
        double rateEURO = 44.13;



        card1.balanceInCurrency(rateEURO, euro);
        card1.balanceInCurrency(rateUSD, usd);
        card2.balanceInCurrency(rateUSD, usd);

    }


}
