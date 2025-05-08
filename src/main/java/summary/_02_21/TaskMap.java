package summary._02_21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskMap {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of("kj", 2, "oo", 5, "le", 9, "rb", 12);
        int num = 6;

        Map<Integer, Boolean> integerBooleanMap = Map.of(1, true, 2, true, 8, true, 11, false);

        System.out.println(hasValueAboveThreshhold(stringIntegerMap, num));
        System.out.println(issAllTrue(integerBooleanMap));

        System.out.println(getSum(stringIntegerMap, Set.of("le", "rb")));
    }

    public static boolean hasValueAboveThreshhold(Map<String, Integer> map, int threshhold) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > threshhold) {
                return true;
            }
        }
        return false;
    }

    public static boolean issAllTrue(Map<Integer, Boolean> map) {
        Set<Map.Entry<Integer, Boolean>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Boolean> entry : entrySet) {
            if (entry.getValue() == false) {
                return false;
            }
        }
        return true;
    }

    public static Integer getSum(Map<String, Integer> map, Set<String> keys) {
        Integer sum = 0;

        for (String strKey : keys) {
            if (map.containsKey(strKey)) {
                sum += map.get(strKey);
            }
        }
        return sum;
    }
}
