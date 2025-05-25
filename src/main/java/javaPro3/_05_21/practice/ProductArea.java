package javaPro3._05_21.practice;

import javaPro3._05_21.elseIf.UserInputStatic;

public class ProductArea {
    public static void main(String[] args) {


        String textRusult = "";
        int x = 10;
        if (x % 2 == 0){
            textRusult = "четное";

        }else {
            textRusult = "нечетное";
        }
        System.out.println("Число " + x + " - " +textRusult);
    }

}
