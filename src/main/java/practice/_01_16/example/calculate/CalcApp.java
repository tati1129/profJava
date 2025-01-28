package practice._01_16.example.calculate;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a, b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculate calculate = new Calculate();
        System.out.println("Input 1 => sum, input 2 => sub");

        int data = scanner.nextInt();
        int result = 0;

//        switch (data){
//            case 1 -> result = calculate.sum(a,b);
//            case 2 -> result = calculate.sub(a,b);
//        }
        System.out.println(result);
    }
}
