package summary._02_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
 * С помощью итератора:
 * a). Вывести имена, состоящие из 4 букв
 * b). Удалить из списка null и пустые строки.
 * С помощью listIterator:
 * c). вывести все элементы листа в обратном порядке.
 * d). Удалить из списка все имена, начинающиеся на "T"
 * e). Заменить в списке "Ann" на "student Ann"
 * <p>
 * <p>
 * Найти все дубликаты в List<String> и вернуть их в виде нового списка.
 */
public class CollecionsTask2 {
    public static void main(String[] args) {

        List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", ""));
        names.add(null);
        List names1 = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", ""));


        System.out.println(nameFour(names));
        System.out.println(reverseList(names));
        removeNamesStartTfromList(names1);
        System.out.println(names1);
        removeNamesStartTfromList(names);
        System.out.println(names);


        replaceStr(names);
        replaceStr(names1);
        System.out.println(names);
        System.out.println(names1);

    }

    public static List<String> nameFour(List<String> strings) {
        List<String> result = new ArrayList<>();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str != null && str.length() == 4) {
                result.add(str);
            }
        }
        return result;
    }

    public static List<String> deleteNullEmpty(List<String> stringList) {
        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str == null || str.isEmpty()) {
                iterator.remove();
            }
        }
        return stringList;
    }


    //С помощью listIterator: вывести все элементы листа в обратном порядке.
    public static List<String> reverseList(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        List<String> result = new ArrayList<>();
        while (listIterator.hasPrevious()) {
            result.add(listIterator.previous());
        }
        return result;
    }

    //С помощью listIterator: Удалить из списка все имена, начинающиеся на "T"
    public static void removeNamesStartTfromList(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            if (str != null && str.startsWith("T")) {
                listIterator.remove();
            }
        }
    }

    //Заменить в списке "Ann" на "student Ann"
    private static void replaceStr(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            if (str != null && str.equals("Ann")) {
                listIterator.set("student Ann");
            }
        }
    }

}

