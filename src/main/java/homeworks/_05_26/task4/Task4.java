package homeworks._05_26.task4;

import homeworks._05_26.UserInput;

public class Task4 {
    public static void main(String[] args) {
        /*
        Проверить является ли число которое ввел пользователь - простым
   (Простое число - число, которое делится без остатка только на 1 и на себя)
         */

        int num = UserInput.inputInt("Введите число");

        isPrime(num); // делала не сама, с подсказками chatGPT

    }


    public static boolean isPrime(int num) {
        if (num <= 1) {// числа меньше 2 — не простые
            return false;
        }
        for (int i = 2; i * i < num; i++) {
            if (num % 2 == 0) {
                System.out.println(num + " — это простое число.");
                return false;// нашли делитель → не простое
            }
        }
        System.out.println(num + " — это не простое число.");
        return true;// делителей нет → простое
    }
}
