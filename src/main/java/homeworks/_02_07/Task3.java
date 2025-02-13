package homeworks._02_07;

import java.util.Iterator;
import java.util.List;

/**
 * 10. Перебрать LinkedList и найти самую короткую строку.
 * <p>
 * 11. Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
 * <p>
 * 12. Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
 * <p>
 * 13. Напишите метод, чтобы получить первое и последнее вхождение указанных элементов в связанном списке. input: list = {1, 4, 3, 2, 1, 2, 2, 0}, element = 2 output: 3 (индекс первого вхождения), 6 (индекс последнего вхождения)
 * 14. Имеется лист. Написать метод, возвращающий этот же лист, в котором элементы расположены в обратном порядке.
 * <p>
 * 15. Найти все дубликаты в List<String> и вернуть их в виде нового списка.
 * <p>
 * 16. Проверить, содержит ли List<String> заданную строку и вернуть ее индекс. Если строка не найдена, вернуть -1.
 */

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = List.of("ASDCX", "sfaafkgzGKQUWZ", "sjhsjh", "we");


        System.out.println("The shortest string from list  " + strings + " is :  '" + findShorterString(strings) + "' ");

        System.out.println(mergeStrings(strings));
    }

    //10. Перебрать LinkedList и найти самую короткую строку.
    public static String findShorterString(List<String> strings) {
        String shortStr = strings.get(0);
        ;
        int minLength = shortStr.length();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str != null && !str.isEmpty() && str.length() < minLength) {
                shortStr = str;
                minLength = str.length();
            }
        }
        return shortStr;
    }

    //11. Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
    public static StringBuilder mergeStrings(List<String> strings) {
        StringBuilder newStr = new StringBuilder();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str != null && !str.isEmpty()) {
                newStr.append(str).append('|');
            }

        }

        newStr = new StringBuilder(newStr.substring(0, newStr.length() - 1));

        return newStr;
    }

    //12. Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
}
