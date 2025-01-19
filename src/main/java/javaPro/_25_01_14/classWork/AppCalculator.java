package javaPro._25_01_14.classWork;
import java.util.Scanner;

/**
 * Написать программу "Калькулятор" таким образом, что бы она принимала от пользователя вычисляемое математическое выражение в виде одной строки. Например, 10.5*5+1-7.1(без пробелов) и последовательно выполняла бы указанные арифметические операции над аргументами.
 * Результат вычислений необходимо вывести с точностью до 2х чисел после запятой в формате:
 * <значение аргумента 1> = <знак математической операции>
 * <значение аргумента 2> = <значение переменной результата>
 * (добавлены пробелы относительно введенной строки)
 */


public class AppCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Calculator calculator = new Calculator();
        System.out.println(calculator.getResult(input));

    }



}
