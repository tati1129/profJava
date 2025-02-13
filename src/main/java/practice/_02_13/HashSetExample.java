package practice._02_13;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        //Внутри сета - мапа - массив
         //В идеальном случае - в одной ячейке один элемент
         //В каждой ячейке массива хранится связны список
         //

        System.out.println("Hello".hashCode());
        System.out.println("A".hashCode());
        System.out.println(Integer.valueOf(10).hashCode());


        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
    }
}
