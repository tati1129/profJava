package summary._02_14;

import java.util.*;

public class Anagramma {
    public static void main(String[] args) {


        String str1 = "Антиквар";
        String str2 = "Травинка";

        System.out.println("isAnagram(str1, str2) = " + isAnagram(str1, str2));
        System.out.println("isAnagramByMap(str1, str2) = " + isAnagramByMap(str1, str2));
    }

    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        String str1 = string1.toLowerCase();
        String str2 = string2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isAnagramByMap(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        String str1 = string1.toLowerCase();
        String str2 = string2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char ch : arr1) {
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        for (char ch : arr2) {
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return map1.equals(map2);
    }
}


