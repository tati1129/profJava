package homeworks._05_22.task1;

import homeworks._05_22.UserInputStatic;

public class Task2 {
    public static void main(String[] args) {
        int userData = UserInputStatic.inputInt("Введите одно из предложенных чисел : 1, 2 или 3");
        String answer = UserInputStatic.inputText("Введите еще раз");

        switch (userData) {
            case 1:
                System.out.println("Вы ввели число 1 ");
                break;
            case 2:
                System.out.println("Вы ввели число 2 ");
                break;
            case 3:
                System.out.println("Вы ввели число 3 ");
                break;
            default:
                System.out.println("Вы ввели некорректное число.");
        }
    }
}
