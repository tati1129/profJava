package summary._02_07;

import java.util.ArrayList;
import java.util.List;

/**
 *     1. У вас есть список значений String, вы должны вернуть список количества символов этих String
 *
 *     2. у вас есть список значений String, вы должны вернуть список со всеми значениями String более трех символов
 *
 *     3. у вас есть список значений Integer, вы должны вернуть их сумму
 *
 *     4. у вас есть список String, вы должны вернуть максимальную длину String
 *
 *     5. Написать метод, который выдает из исходного списка список всех значений, делящихся на заданное число q.
 *
 *     6. Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
 * С помощью итератора:
 * a). Вывести имена, состоящие из 4 букв
 * b). Удалить из списка null и пустые строки.
 * С помощью listIterator:
 * c). вывести все элементы листа в обратном порядке.
 * d). Удалить из списка все имена, начинающиеся на "T"
 * e). Заменить в списке "Ann" на "student Ann"
 */
public class CollectionsTask {
    public static void main(String[] args) {
//List.of("skjdhg", "2lj", "wkjakjh","w")
        List<String> strings = new ArrayList<>();
        strings.add("jdhf");
        strings.add("wwwqjdhf");
        strings.add("jw2dhf");
        strings.add("jd");

List<String> newStr = List.of("skjdhg", "2lj", "wkjakjh","w");

        List<Integer> integers = List.of(32,1,0);

        System.out.println(getSum(integers));
        System.out.println(countChars(strings));
        System.out.println(newListStrMoreThreeElem(strings));


    }


    public static List<Integer> countChars(List<String> strigList ){
        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < strigList.size(); i++) {
            count.add(strigList.get(i).length());
        }
        return count;
    };

    public static List<String> newListStrMoreThreeElem(List<String> stringList ){
        List<String> result = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > 3){
                result.add(stringList.get(i));
            }

        }
        return result;
    };

    public static int getSum(List<Integer> integerList){
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }

   public static int findMaxLength(List<String> strList){
        int maxLength = 0;
        for (String str : strList){
            if (str.length() > maxLength){
                maxLength = str.length();
            }
        }
        return maxLength;
   }

}
