package homeworks._02_07;

import java.util.*;

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
        List<String> strings1 = List.of("ASDCX", "sfaafkgzGKQUWZ", "ASDCX", "sjhsjh", "we", "we");
        LinkedList<Job> jobs = new LinkedList<>();
        jobs.add(new Job("FE", 5500));
        jobs.add(new Job("BE", 5700));
        jobs.add(new Job("QA", 3200));
        jobs.add(new Job("HR", 2900));
        jobs.add(new Job("PR", 4500));
        int salary = 3000;

        LinkedList<Integer> list = createList(1, 4, 3, 2, 1, 2, 2, 1, 0);
        int num1 = 4;
        int num2 = 1;


        System.out.println("The shortest string from list  " + strings + " is :  '" + findShorterString(strings) + "' ");

        System.out.println(mergeStrings(strings));

        removeObjByCondition(jobs, salary);
        System.out.println("Индекс первого вхождения с элементом = " + num1 + " => " + getFirstImpact(list, num1));
        System.out.println("Индекс первого вхождения с элементом = " + num2 + " => " + getFirstImpact(list, num2));
        System.out.println("Индекс  последнего вхождения с элементом = " + num1 + " => " + getLastImpact(list, num1));
        System.out.println("Индекс  последнего вхождения с элементом = " + num2 + " => " + getLastImpact(list, num2));


        System.out.println(reversList(strings));
        System.out.println(reversList(list));
        System.out.println(findDublicate(strings1));
        System.out.println(getIndexStr(strings, "we"));
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
    public static void removeObjByCondition(LinkedList<Job> jobObjects, int salary) {
        Iterator<Job> iterator = jobObjects.iterator();
        while (iterator.hasNext()) {
            Job job = iterator.next();
            if (job.getSalary() < salary) {
                iterator.remove();// Удаляем объект, если его зарплата меньше заданной
            }
        }
        for (Job job : jobObjects) {
            System.out.println(job); // Выводим объект типа Job напрямую
        }
    }

    //13. Напишите метод, чтобы получить первое и последнее вхождение указанных элементов в связанном списке. input: list = {1, 4, 3, 2, 1, 2, 2, 0}, element = 2 output: 3 (индекс первого вхождения), 6 (индекс последнего вхождения)

    //метод создания списка
    public static LinkedList<Integer> createList(Integer... elements) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer elem : elements) {
            newList.add(elem);
        }
        return newList;
    }

    public static int getFirstImpact(LinkedList<Integer> linkedList, int num) {

        return linkedList.indexOf(num);
    }

    public static int getLastImpact(LinkedList<Integer> linkedList, int num) {
        return linkedList.lastIndexOf(num);
    }

    //14. Имеется лист. Написать метод, возвращающий этот же лист, в котором элементы расположены в обратном порядке.

    public static <T> List<T> reversList(List<T> lists) {
        List<T> reversedList = new ArrayList<>();

        for (int i = lists.size() - 1; i >= 0; i--) {
            reversedList.add(lists.get(i));
        }
        return reversedList;
    }

    //15. Найти все дубликаты в List<String> и вернуть их в виде нового списка.

    public static List<String> findDublicate(List<String> stringList) {
        Set<String> seen = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (String str : stringList) {
            if (!seen.add(str)) {
                result.add(str);
            }
        }
        ArrayList<String> dublicate = new ArrayList<>();
        dublicate.addAll(result);
        return dublicate;
    }

    //16. Проверить, содержит ли List<String> заданную строку и вернуть ее индекс. Если строка не найдена, вернуть -1.
    public static int getIndexStr(List<String> stringList, String targetStr){
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals(targetStr)){
                return i;
            }
        }
        return -1;
    }
}


