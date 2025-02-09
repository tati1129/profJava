package summary._02_04;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList arrayList = new ArrayList<>();
        ArrayList arrayList1 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(50));

        }
        System.out.println(arrayList);
        System.out.println("________________");

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        System.out.println("________________");
//        Object object = arrayList.get(0);
//        for (int i = 0; i < arrayList.size(); i++) {
//            if ( arrayList.get(i) < 20) {
//                arrayList1.add(arrayList.get(i));
//            }
//        }
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((int) arrayList.get(i) < 20) {
                arrayList1.add(arrayList.get(i));
                sum += (int) arrayList.get(i);
            }
        }
        System.out.println(arrayList1);
        System.out.println("________________");
        System.out.println("sum = " + sum);
        for (int i = 0; i < arrayList1.size(); i += 3) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();


        for (int i = 0; i < arrayList1.size() / 2; i++) {
            System.out.print(arrayList1.get(i) + " , " + arrayList1.get(arrayList1.size() - 1 - i) + "    ");

        }
    }


}
