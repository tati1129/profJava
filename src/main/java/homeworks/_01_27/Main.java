package homeworks._01_27;

import homeworks._01_23.Card;

import java.util.Scanner;

/*
Создайте класс Карта, которая содержит имя пользователя и баланс
Сделайте несколько конструкторов (перегрузка) для:
-создания карты с именем пользователя и балансом
-создания карты с именем пользователя
Сделайте методы для пополнения/снятия/отображения баланса
Добавьте дополнительный метод для отображения баланса в различных валютах, передавая курс валюты
В методе мэйн проверить работу всех методов класса Card

/**
 * Домашнее, на базе прошлой домашней работы
 * Сделать класс Card родителем,
 * Определите два подкласса (наследника) CreditCard и DebitCard которые реализуют соотв. поведение :
 * •    дебетовая карта: не допускает снятие денег (уменьшение баланса) если это приводит к отрицательному остатку на карте.
 * •    кредитная карта: допускает снятие со счета, даже если баланс не положительный. Т.о., у владельца карты накапливается долг.
 * Также, реализуйте класс Банкомат (Atm) который, используя переданную ему карту, позволяет проводить операции пополнения/снятия/отображения.
 */

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();

        atm.run();

    }


}
