package javaPro3._05_20.random;

import java.util.Random;

public class RandomWithClass {
    public static void main(String[] args) {
        Random myRandom = new Random();

        int random = myRandom.nextInt();
        System.out.println(random);
    }
}
