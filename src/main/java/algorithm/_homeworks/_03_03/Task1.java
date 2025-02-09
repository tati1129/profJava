package algorithm._homeworks._03_03;

import java.util.Scanner;

/**
 * Задача: Найти наибольшее число из трех заданных чисел.
 * Алгоритм:
 * <p>
 * Получить три числа. Обозначим их как a, b и c.
 * <p>
 * Сравнить a и b.
 * 2.1.  Если a больше b, то переходим к шагу 3.
 * 2.2. Иначе, b больше или равно a, тогда присваиваем b значение a.
 * <p>
 * Сравнить a и c.
 * 3.1.  Если a больше c, то a - наибольшее число, завершаем алгоритм.
 * 3.2. Иначе, c больше или равно a, тогда c - наибольшее число, завершаем алгоритм.
 */
public class Task1 {
    public static void main(String[] args) {

        int a = 3;
        int b = 121;
        int c = -10;

        System.out.println(String.format("Max number from %d, %d %d is:  %d ", a, b, c, getMaxNum(a, b, c)));


        Scanner scanner = new Scanner(System.in);

        int num1 = getNum(scanner);
        int num2 = getNum(scanner);
        int num3 = getNum(scanner);
        int maxNum = getMaxNum(num1, num2, num3);

        System.out.println(String.format("Max number from %d, %d %d is:  %d ", num1, num2, num3, maxNum));

    }

    public static int getNum(Scanner scanner) {

        System.out.println("Введите целое число");
        return scanner.nextInt();
    }

    public static int getMaxNum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
