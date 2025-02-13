package practice._02_11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(12);
        System.out.println(myArrayList);
        System.out.println(Arrays.toString(myArrayList.elementData));

        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        System.out.println(Arrays.toString(myArrayList.elementData));

        myArrayList.add(10);
        System.out.println(Arrays.toString(myArrayList.elementData));

        System.out.println(myArrayList);

        System.out.println(myArrayList.remove(Integer.valueOf(4)));

        System.out.println(myArrayList);
        System.out.println(Arrays.toString(myArrayList.elementData));


        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(3);

        System.out.println(myLinkedList);
    }
}
