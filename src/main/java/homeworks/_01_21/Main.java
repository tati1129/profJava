package homeworks._01_21;
/*
Написать программу, которая принимает на вход три целых числа:
*1. algorithmld - тип алгоритма
        1.вычисление ряда чисел Фибоначчи;
        2.вычисление факториала
*2. LoорТуре - тип циклов, которые нужно использовать:
        1. цикл while
        2. цикл do-while
        3. цикл for
*3. n - параметр, передаваемый в алгоритм.

К примеру, если передаются числа "1 3 5", программе необходимо вывести на экран первые 5 чисел Фибоначчи и при вычислении использовать цикл for.
К примеру, если передаются числа "2 1 7" , программе необходимо вывести на экран факториал числа 7 и при его вычислении использовать цикл while.
Числа Фибоначчи начинаются с нуля: 0 11235 ...

 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FibonacciSequence fibonacci = new FibonacciSequence();
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input type algorithm. 1 - Fibonacci, 2 - Factorial");
        int typeAlgorithm  = scanner.nextInt();

        System.out.println("Choose LoорТуре. 1 -  while, 2 - do-while, 3 - for");
        int loopType = scanner.nextInt();

        System.out.println("Input the parameter (n): ");
        int parametr = scanner.nextInt();

        switch (typeAlgorithm){
            case 1:
                System.out.println("fibonacci Sequence");
                switch (loopType){
                    case 1:
                        System.out.println(fibonacci.fibonacciSequenceWhile(parametr));
                        break;
                    case 2:
                        System.out.println(fibonacci.fibonacciSequenceDoWhile(parametr));
                        break;
                    case 3:
                        System.out.println(fibonacci.fibonacciSequenceFor(parametr));
                        break;
                    default:
                        System.out.println("Invalid loop type...");
                }
                break;

            case 2:
                System.out.println("Factorial: ");
                switch (loopType){
                    case 1:
                        System.out.println(factorial.factoriaWhile(parametr));
                        break;
                    case 2:
                        System.out.println(factorial.factorialDoWhile(parametr));
                        break;
                    case 3:
                        System.out.println(factorial.factorialFor(parametr));
                        break;
                    default:
                        System.out.println("Invalid loop type...");
                }

        }

    }
}
