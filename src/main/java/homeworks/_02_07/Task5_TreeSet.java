package homeworks._02_07;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 20. Создать TreeSet. Из него: Найти заданное число 10, самое большое, самое маленькое Вывести все четные числа Получить список всех чисел в обратном порядке Получить список всех чисел меньше 7
 * <p>
 * * 22. Имеется два набора элементов Set. Создать Set, в котором бы находились: все элементы из двух наборов, только общие для двух наборов элементы, только элементы, которые присутствуют в первом наборе и отсутствуют во втором
 */
public class Task5_TreeSet {
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

        TreeSet<Integer> intTreeSet1 = new TreeSet<>(List.of(10, 110, 210, 110, 100, 50));
        Set<Integer> int1 = new HashSet<>(List.of(1, 2, 3, 5, 7, 50));
        Set<Integer> int2 = new HashSet<>(List.of(2, 11, 21, 50));


        System.out.println(intTreeSet);

        isContainNumber(intTreeSet, num);
        System.out.println("The biggest number from TreeSet  " + intTreeSet + " is : " + getBiggerNum(intTreeSet));
        System.out.println("The smallest number from TreeSet  " + intTreeSet + " is : " + getSmallestNum(intTreeSet, num));

        System.out.println(getEvenNumber(intTreeSet));
        reverceTreeSet(intTreeSet);
        System.out.println(getTreeSetMoreThanNum(intTreeSet, num1));
        System.out.println(createSet(int1, int2));

        System.out.println(generalElements(int1, int2));
        System.out.println(uniqeElemFromSet1(int1, int2));
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

    public static void reverceTreeSet(TreeSet<Integer> integers) {

        System.out.println(integers.descendingSet());
    }

    public static TreeSet<Integer> getTreeSetMoreThanNum(TreeSet<Integer> integers, int num) {
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer anInt : integers) {
            if (anInt > num) {
                result.add(anInt);
            }
        }
        return result;
    }

    //22. Имеется два набора элементов Set. Создать Set, в котором бы находились: все элементы из двух наборов, только общие для двух наборов элементы, только элементы, которые присутствуют в первом наборе и отсутствуют во втором

//22.1 Имеется два набора элементов Set. Создать Set, в котором бы находились: все элементы из двух наборов
    public static Set<Integer> createSet(Set<Integer> integers1, Set<Integer> integers2) {
        Set<Integer> newSet = new HashSet<>();
        newSet.addAll(integers1);
        newSet.addAll(integers2);
        return newSet;
    }

    //22.2 только общие для двух наборов элементы,
    public static Set<Integer> generalElements(Set<Integer> integers1, Set<Integer> integers2) {
        Set<Integer> result = new HashSet<>();
        for (Integer el : integers1) {
            if (integers2.contains(el)) {
                result.add(el);
            }
        }
        return result;
    }
    //22.3 только элементы, которые присутствуют в первом наборе и отсутствуют во втором

    public static Set<Integer> uniqeElemFromSet1(Set<Integer> integers1, Set<Integer> integers2){
        Set<Integer> result = new HashSet<>();
        for (Integer el : integers1){
            if (!integers2.contains(el)){
                result.add(el);
            }
        }
        return  result;
    }
}
