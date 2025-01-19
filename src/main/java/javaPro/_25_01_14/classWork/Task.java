package javaPro._25_01_14.classWork;

public class Task {

    public static void main(String[] args) {
        int[] arr = {3, -7, 2, 8, 10, -6, 4};
        System.out.println(getMaxNum(arr));
        System.out.println(getMaxNumEvenIndex(arr));
    }



    //максимального значения среди элементов массива
    public static int getMaxNum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }


    //максимального значения среди элементов массива с чётными индексами.
    public static int getMaxNumEvenIndex(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

}
