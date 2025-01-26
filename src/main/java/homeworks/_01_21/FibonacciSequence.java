package homeworks._01_21;


import java.util.Arrays;

public class FibonacciSequence {

    private int length;

    public FibonacciSequence() {
    this.length = 0;
    }

    public FibonacciSequence(int length) {
        setLenght(length);
    }

    public void setLenght(int length) {
        if (length < 0){
            System.out.println("Input incorrect!");
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public int getLength() {
        return this.length;
    }

    public String fibonacciSequenceWhile(int length) {

        int[] fibArray = fibonachiWhile(length);
        return Arrays.toString(fibArray);
    }
    public String fibonacciSequenceDoWhile(int length) {

        int[] fibArray = fibonachiDoWhile(length);
        return Arrays.toString(fibArray);
    }
    public String fibonacciSequenceFor(int length) {

        int[] fibArray = fibonachiFor(length);
        return Arrays.toString(fibArray);
    }


    //while
    private int[] fibonachiWhile(int length) {
        int[] arr = new int[length];
        if (length <= 1) {
            arr[0] = 0;
        }
        if (length >= 2) {
            arr[1] = 1;
        }
        int i = 2;
        while (i < arr.length) {
            arr[i] = arr[i - 1] + arr[i - 2];
            i++;
        }

        return arr;
    }


     //for
    private int[] fibonachiFor(int length) {
        int[] arr = new int[length];
        if (length > 0) {
            arr[0] = 0;
        }
        if (length >1) {
            arr[1] = 1;
        }

        for (int i = 2; i < length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }


//while-do
    private int[] fibonachiDoWhile(int length){
        int[] arr = new int[length];
        if (length > 0){
            arr[0] = 0;
        }
        if (length > 1){
            arr[1] = 1;
        }

        int i = 2;
        do {
            arr[i] = arr[i-1] + arr[i-2];
            i++;
        } while (i < length);

        return  arr;
    }
}
