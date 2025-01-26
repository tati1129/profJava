package homeworks._01_23_task1;

import homeworks._01_23_task1.Card;
import homeworks._01_23_task1.ChangeBalance;
import homeworks._01_23_task1.Converter;

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

       ChangeBalance operations = new ChangeBalance() {
        };

        operations.addMoney(card1, 500);
        operations.extractMoney(card1, 200);
        operations.checkBalance(card2);

        String euro = "EURO";
        String usd = "USD";
        double rateUSD = 42.75;
        double rateEURO = 44.13;

        Converter converter = new Converter(){};

        converter.balanceInCurrency(card1,rateEURO, euro);
        converter.balanceInCurrency(card1,rateUSD, usd);
        converter.balanceInCurrency(card2,rateUSD, usd);

    }


}
