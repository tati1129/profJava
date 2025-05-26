package homeworks._05_26;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static String inputText(String message){
        System.out.println(message);
        String text = scanner.nextLine();
        return text;
    }

    public static int inputInt(String message){
        System.out.println(message);
        int integer = scanner.nextInt();
        scanner.nextLine();
        return integer;
    }

    public static void closeScanner(){
        scanner.close();
    }
}
