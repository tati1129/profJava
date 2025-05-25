package homeworks._05_22.task1;

import homeworks._05_22.UserInputStatic;

public class Task1 {
    public static void main(String[] args) {
        //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        //а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3

        int userData = UserInputStatic.inputInt("Введите одно из предложенных чисел : 1, 2 или 3");
        String answer = UserInputStatic.inputText("Введите еще раз");

        if (userData > 1 && userData < 3) {
            if (userData == 1) {
                System.out.println("Вы ввели чило 1 ");
            } else if (userData == 2) {
                System.out.println("Вы ввели чило 2 ");
            } else {
                System.out.println("Вы ввели чило 3 ");
            }
        } else {
            System.out.println("Вы ввели некорректное число.");
            System.out.println();
        }
    }
}
