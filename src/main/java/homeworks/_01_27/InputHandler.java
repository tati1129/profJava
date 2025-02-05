package homeworks._01_27;

import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public int enterPin() {
        System.out.println("Enter your PIN kod. ");
        return scanner.nextInt();
    }

    public int chooseAccount() {
        System.out.println("Choose your account. ");
        System.out.println(" 1 - Credit account ");
        System.out.println(" 2 - Debit account ");
        return scanner.nextInt();
    }

    public int chooseAction() {
        System.out.println("Choose an action:");
        System.out.println("1 - Withdraw money");
        System.out.println("2 - Deposit money");
        System.out.println("3 - Check balance");
        System.out.println("4 - Exit");

        return scanner.nextInt();
    }

    public double enterAmount() {
        System.out.println("Enter amount: ");
        return scanner.nextDouble();
    }


}