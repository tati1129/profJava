package homeworks.homeworks_2025_01_16;


import java.util.Arrays;

public class Fibonachi {

    public String fibonacciSequence(int length) {

        if (length <= 0) {
            return "[]";
        }

        int[] fibArray = fibonachi(length);

        return Arrays.toString(fibArray);
    }


    /*
    //while
    private int[] fibonachi(int length) {
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

     */

    /*
     //for
    private int[] fibonachi(int length){
        int[] arr = new int[length];
        if (length <= 1){
            arr[0] = 0;
        }
        if (length >= 2){
            arr[1] = 1;
        }

        for (int i = 2; i < arr.length ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return  arr;
    }
    */


//while-do
    private int[] fibonachi(int length){
        int[] arr = new int[length];
        if (length <= 1){
            arr[0] = 0;
        }
        if (length >= 2){
            arr[1] = 1;
        }

        int i = 2;
        do {
            arr[i] = arr[i-1] + arr[i-2];
            i++;
        } while (i < arr.length);

        return  arr;
    }
}
