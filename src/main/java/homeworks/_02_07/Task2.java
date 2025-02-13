package homeworks._02_07;

import java.util.*;

/**
 * * 8. Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
 * *
 * * С помощью итератора:
 * * 8a). Вывести имена, состоящие из 4 букв
 * * 8b). Удалить из списка null и пустые строки.
 * * С помощью listIterator:
 * * 8c). вывести все элементы листа в обратном порядке.
 * * 8d). Удалить из списка все имена, начинающиеся на "T"
 * * 8e). Заменить в списке "Ann" на "student Ann"
 *
 * 9. Найти все дубликаты в List<String> и вернуть их в виде нового списка.
 */
public class Task2 {
    public static void main(String[] args) {

        List names = new ArrayList(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", ""));
        List names1 = new ArrayList(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", "Mark", "Mark", "Tim", "Tom"));
        names.add(null);

        System.out.println(names + "   nameFourLetters =>   " + nameFourLetters(names));

        System.out.println(names + "   replaceNull =>   " + replaceNull(names));

        System.out.println(names + "   reverceList =>   " + reverceList(names));


        removeNamesStartT(names);
        System.out.println(" remove names start from letters ' T '  =>   " + names);

        replaceStr(names);
        System.out.println(" replace names 'Ann' on 'student Ann'  =>   " + names);
    }

    public static List<String> nameFourLetters(List<String> strings) {
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

    public static List<String> replaceNull(List<String> strings) {
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str == null || str.isEmpty()) {
                iterator.remove();
            }
        }
        return strings;
    }

    public static List<String> reverceList(List<String> stringList) {

        ListIterator<String> listIterator =
                stringList.listIterator(stringList.size());

        List<String> result = new ArrayList<>();

        while (listIterator.hasPrevious()) {
            result.add(listIterator.previous());
        }
        return result;
    }

    public static void removeNamesStartT(List<String> strings) {

        ListIterator<String> listIterator = strings.listIterator(strings.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            if (str != null && str.startsWith("T")) {
                listIterator.remove();
            }
        }
    }
    public static void replaceStr(List<String> strings){
        ListIterator<String> listIterator = strings.listIterator(strings.size());

        while (listIterator.hasPrevious()){
            String str = listIterator.previous();
            if (str.equals("Ann")){
                listIterator.set("student Ann");
            }
        }
    }

    public static List<String> findDublicate(List<String> strings){
        List<String> dublicate = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        Iterator<String> iterator = strings.listIterator();
        while (iterator.hasNext()){
            String str = iterator.next();

            if (str != null && !seen.add(str) && !dublicate.contains(str)){
                dublicate.add(str);
            }
        }
        return  dublicate;
    }

}
