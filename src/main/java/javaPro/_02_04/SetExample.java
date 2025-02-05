package javaPro._02_04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();

//        set.add(1);
//        set.add(1);
//        set.add(2);

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Five");
        set.add("Six");
        set.add("Seven");

        System.out.println(set);

        //set это множество
        for (Object o : set){
            System.out.println(o);
        }


        ///   /////////////
        Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Five");
        linkedHashSet.add("Six");
        linkedHashSet.add("Seven");

        System.out.println(linkedHashSet);

        /// /////////////

        Set treeSet = new TreeSet();

        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("6");
        treeSet.add("10");
        treeSet.add("7");

        System.out.println(treeSet);
    }
}
