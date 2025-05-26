package homeworks._05_26.task2;

import homeworks._05_26.UserInput;

public class Task2 {
    public static void main(String[] args) {
        int input = UserInput.inputInt("Введите число");
int summ = 0;

        for (int i = 0; i < input; i+=2) {
            summ += i;

        }
        System.out.println("Сумма всех четных чисел = " + summ);
    }
}
