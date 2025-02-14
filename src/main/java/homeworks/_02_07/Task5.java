package homeworks._02_07;

import java.util.Set;
import java.util.TreeSet;

/**
 * 20. Создать TreeSet. Из него: Найти заданное число 10, самое большое, самое маленькое Вывести все четные числа Получить список всех чисел в обратном порядке Получить список всех чисел меньше 7
 * *
 * * 21. Создать класс Point для хранения координат (x, y) точки на плоскости. Создать список точек, отсортировать по координате y. Создать TreeSet со всеми уникальными точками. Создать TreeSet со всеми различными по координате y точками.
 * *
 * * 22. Имеется два набора элементов Set. Создать Set, в котором бы находились: все элементы из двух наборов, только общие для двух наборов элементы, только элементы, которые присутствуют в первом наборе и отсутствуют во втором
 * *
 * * 23. На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек: Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.
 */
public class Task5 {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 7;
        TreeSet<Integer> intTreeSet = new TreeSet<>();
        intTreeSet.add(1);
        intTreeSet.add(11);
        intTreeSet.add(21);
        intTreeSet.add(110);
        intTreeSet.add(10);
        intTreeSet.add(50);

//        System.out.println(intTreeSet);
//
////        isContainNumber(intTreeSet, num);
//        System.out.println("The biggest number from TreeSet  " + intTreeSet + " is : " + getBiggerNum(intTreeSet));
//        System.out.println("The smallest number from TreeSet  " + intTreeSet + " is : " + getSmallestNum(intTreeSet, num));

        System.out.println(getEvenNumber(intTreeSet));
        reverceTreeSet(intTreeSet);
        System.out.println(getTreeSetMoreThanNum(intTreeSet, num1));
    }

    //20. Создать TreeSet. Из него: Найти заданное число 10, самое большое, самое маленькое Вывести все четные числа Получить список всех чисел в обратном порядке Получить список всех чисел меньше 7
    public static boolean isContainNumber(TreeSet<Integer> integerTreeSet, int num) {

        if (integerTreeSet.contains(num)) {
            System.out.println("Число 10 найдено в TreeSet.");
            return true;
        } else {
            System.out.println("Число 10 не найдено в TreeSet.");
            return false;

            // какой вариант лучше?
//        for (Integer anInt : integerTreeSet){
//            if (anInt == num){
//                System.out.println("TreeSet " + integerTreeSet + " contain " + num);
//                return true;
//            }
//        }
//        return false;
        }
    }

    public static int getBiggerNum(TreeSet<Integer> integers) {
        return integers.last();
    }

    public static int getSmallestNum(TreeSet<Integer> integers, int num) {
        return integers.first();
    }

    public static TreeSet<Integer> getEvenNumber(TreeSet<Integer> integers) {
        TreeSet<Integer> result = new TreeSet<>();
        if (integers.isEmpty()) {
            System.out.println("TreeSet is empty!");
        } else {
            for (Integer anInt : integers) {
                if (anInt % 2 == 0) {
                    result.add(anInt);
                }
            }
        }
        return result;
    }
    public static void reverceTreeSet(TreeSet<Integer> integers){

        System.out.println(integers.descendingSet());
    }
    public  static TreeSet<Integer> getTreeSetMoreThanNum(TreeSet<Integer> integers, int num){
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer anInt : integers){
            if (anInt > num){
                result.add(anInt);
            }
        }
        return result;
    }
}
