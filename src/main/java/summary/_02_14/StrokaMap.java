package summary._02_14;
/**
 * 1.Дано число от 1 до 10, вывести на экран его строковое представление
 * 2. Найти все ключи в Map<String, Integer>, соответствующие заданному значению, и вернуть  их в виде списка
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StrokaMap {
    public static void main(String[] args) {
        Map<String, Integer > map1 = Map.of("one", 1, "one", 1,"two", 2 ,"three",3);

       int num = 10;

        System.out.println(convertNumberToString(num));


    }
    public static String convertNumberToString(Integer num){
        Map<Integer, String > map = Map.of(1, "one", 2,"two", 3,"three", 4, "four", 5, "five", 6, "six", 7, "seven", 8, "eigt", 9, "nine", 10, "ten");

        if (!map.containsKey(num)){
            throw  new IllegalArgumentException();
        }

        return map.get(num);
}
public static List<String> findKeys(Map<String, Integer> map, Integer target){
        List<String> result = new ArrayList<>();
    Set<Map.Entry<String, Integer>> set =map.entrySet();
       for (Map.Entry<String, Integer> entry : set){
           if (entry.getValue().equals(target)){
               result.add(entry.getKey());
           }
       }
       return  result;
}
}
