package homeworks._01_16;

import java.util.Scanner;

/**
 *
 Написать класс FibonacciSequence, в котором есть поле length - длинна последовательности Фибоначчи.
 Написать 3 метода в этом классе, возвращающих последовательность фибоначчи размера length в виде массива. Пример [0, 1, 1, 2, 3, 5] для length = 6.
 Каждый метод использует свой вариант цикла: 1 метод через цикл for, 2 через while, 3 через do-while.
 Написать конструктор с параметром и без параметров для этого класса. Не допускать возможность установки отрицательного значения length.

 Написать программу (отдельный класс с методом main) в котором создать объект класса FibonacciSequence и протестировать работу всех получившихся методов.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length for Fibonacci");
        int num  = scanner.nextInt();
        FibonacciSequence fibonacci = new FibonacciSequence(num);
        System.out.println("Fibonacci using 'while': " + fibonacci.fibonacciSequenceWhile(num));
        System.out.println("Fibonacci using 'do-while': " + fibonacci.fibonacciSequenceDoWhile(num));
        System.out.println("Fibonacci using 'for': " + fibonacci.fibonacciSequenceFor(num));



    }
}
