package homeworks._02_07;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 17. Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
 *
 * 18. Проверить, содержит ли List<String> хотя бы одну строку, которая начинается с заданного префикса.
 *
 * 19. Получить все возможные комбинации из Set<String> и Set<Integer>, где каждая комбинация представляет собой строку и число, объединенные вместе.
 */

public class Task4 {
    public static void main(String[] args) {
        Set<Integer> integerSet = Set.of(8,6,3,2,1);
        Set<String> stringSet = Set.of("DF", "REWE", "AAA");
        //List<String> strings= List.of("DF", "REWE", "AAA");
        String prefix1 = "RE";
        String prefix2 = "re";
        String prefix3 = "ro";

//        System.out.println(getSum(integerSet));
//        System.out.println(getCombinations(stringSet, integerSet));

        isContainStartChar(stringSet,prefix1);
        isContainStartChar(stringSet,prefix2);
        isContainStartChar(stringSet,prefix3);

    }

    //17. Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
    public static int getSum(Set<Integer> integerSet){
        int sum = 0;
        for (Integer anInt : integerSet){
            if (anInt % 2 == 0){
                sum += anInt;
            }
        }
        return sum;
    }

    //18. Проверить, содержит ли List<String> хотя бы одну строку, которая начинается с заданного префикса.
    public static void isContainStartChar(Set<String> strings, String prefix){
        boolean hasPrefix = false;
        for (String str : strings){
            if (str.startsWith(prefix)){
                hasPrefix = true;
                break;
            }
        }
        System.out.println("Есть строка с префиксом " + prefix + " ': " + hasPrefix);
    }

    //19. Получить все возможные комбинации из Set<String> и Set<Integer>, где каждая комбинация представляет собой строку и число, объединенные вместе.
    public static Set<String>  getCombinations(Set<String> strings, Set<Integer> integers){
        Set<String> result = new HashSet<>();
        for (Integer anInt : integers){
            for (String str : strings){
                String combination = str + anInt;
                result.add(combination);
            }
        }
        return result;
    }

    //20. Создать TreeSet. Из него: Найти заданное число 10, самое большое, самое маленькое Вывести все четные числа Получить список всех чисел в обратном порядке Получить список всех чисел меньше 7
}
