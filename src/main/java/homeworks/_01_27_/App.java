package homeworks._01_27_;


import homeworks._01_27_.exception.InvalidPinException;

/**
 * Домашнее, на базе прошлой домашней работы
 * Сделать класс Card родителем,
 * Определите два подкласса (наследника) CreditCard и DebitCard которые реализуют соотв. поведение :
 * •    дебетовая карта: не допускает снятие денег (уменьшение баланса) если это приводит к отрицательному остатку на карте.
 * •    кредитная карта: допускает снятие со счета, даже если баланс не положительный. Т.о., у владельца карты накапливается долг.
 * Также, реализуйте класс Банкомат (Atm) который, используя переданную ему карту, позволяет проводить операции пополнения/снятия/отображения.
 */

public class App {
    public static void main(String[] args) throws InvalidPinException {
        CreditCard creditCardUser1 = new CreditCard("Antony", 2000.0, 1111, 5000);
        DebitCard debitCardUser1 = new DebitCard("Antony", 3500.0, 1111);

        CreditCard creditCardUser2 = new CreditCard("Mary", 3000.0, 2222);
        DebitCard debitCardUser2 = new DebitCard("Mary", 15000.0, 2222);

        Atm atm = new Atm();

        atm.setCard(creditCardUser1, 1111);
        atm.extractMoney(1000);         // Снимаем деньги (1000)
        atm.addMoney(500);              // Пополняем баланс (500)
        atm.checkBalance();             // Проверяем баланс
        atm.ejectCard();                // Извлекаем карту

    }
}
