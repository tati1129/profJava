package summary._02_07;

import java.util.*;

/**
 * Найти все дубликаты в List<String> и вернуть их в виде нового списка.
 * public static List<String> getAllDublicates(List<String> strings){
 * List<String> stringsDublicates = new ArrayList<>();
 * for (int i = 0; i < strings.size(); i++) {
 * for (int j = i + 1; j < strings.size(); j++) {
 * if (strings.get(i).equals(strings.get(j))){
 * stringsDublicates.add(strings.get(i));
 * }
 * }
 * }
 * return stringsDublicates;
 * }
 */

public class CollectionTask3 {
    public static void main(String[] args) {
        List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", ""));
        names.add(null);
        List names1 = new ArrayList<>(List.of("Mary","Tom", "Jane","Jane", "Tom", "Tom", "Tim","Jane", "Mark", "Ann", ""));


        System.out.println(findDublicate(names1));
    }

    public static List<String> findDublicate(List<String> strings) {
       List<String> dublicate =new ArrayList<>();
        Set<String> seen  = new HashSet<>();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();

            if (str != null && !seen.add(str) && !dublicate.contains(str)) {
                dublicate.add(str);
            }
        }

        return dublicate;
    }
    /**
     * Найти все дубликаты в List<String> и вернуть их в виде нового списка

     public static List<String> getAllDublicates(List<String> strings){
     Set<String> stringsDublicates = new HashSet<>();
     for (int i = 0; i < strings.size(); i++) {
     for (int j = i + 1; j < strings.size(); j++) {
     if (strings.get(i).equals(strings.get(j))){
     stringsDublicates.add(strings.get(i));
     }
     }
     }

     return new ArrayList<>(stringsDublicates);
     }
     */
}
