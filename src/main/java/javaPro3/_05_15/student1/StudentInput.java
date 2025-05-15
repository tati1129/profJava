package javaPro3._05_15.student1;

import java.util.Scanner;

public class StudentInput {
    Scanner scanner;

    public StudentInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public void inputBoolean(String message, Student student) {
        System.out.println(message);
        String inputText = scanner.nextLine().trim().toLowerCase();

        student.setStudy(inputText.equals("y"));
    }
}
