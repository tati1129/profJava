package practice._02_13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        String str = "ASFALJLsk JKDJFHDGfgdsfag hjdksjggfghg";

        printUnique(str);
    }

    public static void printUnique(String string){
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.charAt(i));
        }
        System.out.println(result + " count dublicate: " + result.size());
    }
}
