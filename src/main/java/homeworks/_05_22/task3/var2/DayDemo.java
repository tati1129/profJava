package homeworks._05_22.task3.var2;

import homeworks._05_22.UserInputStatic;

public class DayDemo {
    public static void main(String[] args) {
        int inputInt = UserInputStatic.inputInt("Введите число от 1 до 7");

        if (inputInt>=1 && inputInt<= 7){
                Day day = Day.values()[inputInt-1];
                System.out.println(day);
        }else {
            System.out.println("Вы ввели некорректный ответ");
            String inputString = UserInputStatic.inputText("Повторите ввод :");
            System.out.println("Вы повторили: " + inputString);
        }
    }
}
