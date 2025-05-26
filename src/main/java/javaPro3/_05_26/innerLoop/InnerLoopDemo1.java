package javaPro3._05_26.innerLoop;

public class InnerLoopDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            System.out.println("Значение индекса i = " + i);
            for (int j = 1; j < 5 ; j++) {
                System.out.println("Значение второго цикла j = "+ j);
            }
            System.out.println("--------------------");
        }
    }
}
