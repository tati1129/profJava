package javaPro3._05_26.while5;

import javaPro3._05_26.UserInputStatic;

public class WhileDemo5 {
    public static void main(String[] args) {
        int summ = 0;
        boolean condition = true;
        while (condition){
            int num = UserInputStatic.inputInt("Введите целое числа");
            if (num>=0){
                summ += num;
            }else {
                condition = false;
            }

        }
        System.out.println("Итоговая сумма положительных чисел :" + summ);
    }
}
