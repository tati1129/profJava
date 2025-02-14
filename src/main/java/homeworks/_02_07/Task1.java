package homeworks._02_07;
/**
 * 1. У вас есть список значений String, вы должны вернуть список количества символов этих String
 * 2. у вас есть список значений String, вы должны вернуть список со всеми значениями String более трех символов
 * 3. у вас есть список значений Integer, вы должны вернуть их сумму
 * 4. у вас есть список значений Integer, вы должны вернуть их максимум
 * 5. у вас есть список String, вы должны вернуть максимальную длину String
 * 6. Написать метод, который проверяет, является ли список Integer отсортированным.
 * 7. Написать метод, который выдает из исходного списка список всех значений, делящихся на заданное число q.
 * *
 */

import homeworks._02_07.exception.DividedOnZero;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = List.of("skjdhg", "2lj", "wkjakjh", "w");
        List<Integer> integerList = List.of(1, 22, -1, -23, 5, 25, 125, 33, 44);
        List<Integer> intList1 = List.of(1, 2, 3, 4, 6);
        List<Integer> intList2 = List.of(10, 8, 4, 2, 1);
        //      int num = 5;
//       int num = 11;
//       int num = 2;
        int num = 2;
//        int num = 0;


        System.out.println( countChar(strings));
        System.out.println(findListMoreThree(strings));
        System.out.println(getSum(integerList));
        System.out.println(integerList + " max: "+getMax(integerList));
        System.out.println(getMaxStrLength(strings));

        System.out.println(intList1 + " is Sorted asc: " + isListSortedAsc(intList1));
        System.out.println(intList2 + " is Sorted asc: " + isListSortedAsc(intList2));
        System.out.println(integerList + " is Sorted asc: " + isListSortedAsc(integerList));
        System.out.println(intList1 + " is Sorted desc: " + isListSortedDesc(intList1));
        System.out.println(intList2 + " is Sorted desc: " + isListSortedDesc(intList2));
        System.out.println(integerList + " is Sorted desc: " + isListSortedDesc(integerList));

        System.out.println(integerList + "  divided on " + num + " " + findDividedOnNum(integerList, num));

    }

    public static List<Integer> countChar(List<String> strings) {
        List<Integer> listCount = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            listCount.add(strings.get(i).length());
        }
        return listCount;
    }

    public static List<String> findListMoreThree(List<String> strings) {
        List<String> newList = new ArrayList<>();

        for (String string : strings) {
            if (string != null && !string.isEmpty() && string.length() > 3) {
                newList.add(string);
            }
        }
        return newList;
    }

    ;

    public static int getSum(List<Integer> listInt) {
        int sum = 0;
        for (Integer integer : listInt) {
            sum += integer;
        }

//        for (int i = 0; i <listInt.size() ; i++) {
//            sum += listInt.get(i);
//        }

        return sum;
    }

    ;

    public static int getMax(List<Integer> intList) {
        int max = intList.get(0);
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) > max) {
                max = intList.get(i);
            }
        }
        return max;
    }

    public static int getMaxStrLength(List<String> strings) {
        int max = 0;
        for (String str : strings) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        return max;
    }

    ;

    public static boolean isListSortedAsc(List<Integer> intList) {

        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) < intList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    ;

    public static boolean isListSortedDesc(List<Integer> intList) {
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) > intList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    ;

    public static List<Integer> findDividedOnNum(List<Integer> intList, int num) {
        if (num == 0) {
            throw new DividedOnZero("Ошибка: Деление на ноль невозможно!");
        }
        List<Integer> newListInt = new ArrayList<>();

        for (Integer integer : intList) {
            if (integer % num == 0) {
                newListInt.add(integer);
            }
        }


        return newListInt;
    }


}
