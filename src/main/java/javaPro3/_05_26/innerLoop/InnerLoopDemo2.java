package javaPro3._05_26.innerLoop;

public class InnerLoopDemo2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 ; j++) {
                System.out.print("  " + i*j);
            }
            System.out.println();
        }
    }
}
