package algorithm._homeworks._03_10;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 6, 2, 1, 9, 22, -3, 4, 7};
        int num = 4;
        System.out.println(linearSearch(array, num));

    }

    public static int linearSearch(int[] numbers, int target_number) {
        // You code...
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target_number) {
                return i;
            }

        }
        return -1;
    }
}