package javaPro._02_13;

public class Main {
    public static void main(String[] args) {
        Example<String> example = new Example<>();

        example.setField("1");

        Example<Integer> integerExample = new Example<>();
        integerExample.setField(1);

        Printer.print(1);
        Printer.print("eee");
    }
}
