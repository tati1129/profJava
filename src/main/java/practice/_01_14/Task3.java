package practice._01_14;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        changeArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray(int[] arr){
        arr[0] = 10;
    }
}
