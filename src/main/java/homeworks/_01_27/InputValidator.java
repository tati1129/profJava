package homeworks._01_27;

import homeworks._01_27.exceptions.InvalidAmountException;
import javaPro._01_30.exceptions.InvalidLengthException;

import java.util.InputMismatchException;
import java.util.Scanner;

// Метод для ввода пин-кода с проверкой длины
public class InputValidator {
    public static int getIntInput(Scanner scanner) {
        int input = -1;
        boolean valid = false;
        while (!valid) {
            try {
                input = scanner.nextInt();
                if (input < 1000 || input > 9999) {
                    throw new InvalidLengthException("Invalid Pin length. Please enter a 4-digit PIN. ");
                }
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            } catch (InvalidLengthException e) {
                System.out.println(e.getMessage());// Выводим сообщение из кастомного исключения
            }
        }
        return input;
    }

    // Метод для ввода суммы
    public static double getDoubleInput(Scanner scanner) {
        double input = -1;
        boolean valid = false;
        while (!valid) {
            try {
                input = scanner.nextDouble();
                if (input <= 0) {
                    throw new InvalidAmountException("Amount must be greater than zero.");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid amount.");
                scanner.next(); // Очищаем буфер ввода
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage()); // Выводим сообщение из кастомного исключения
            }
        }
        return input;
    }
}