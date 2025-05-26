package javaPro3._05_26.doWhile;

import javaPro3._05_26.UserInputStatic;

public class DohileWhile {
    public static void main(String[] args) {
        System.out.println("Введите текст или enter для выхода");
        String userText= "";
        do {
            userText = UserInputStatic.inputString("");
            System.out.println("Ваш текст" + userText);
        }while (!userText.isEmpty());
    }
}
