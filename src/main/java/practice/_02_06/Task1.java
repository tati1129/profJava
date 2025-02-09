package practice._02_06;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //Размер после создания изменить нельзя
        //Сохраняет только однородные данные - задача любой структуры данных
        //для работы с ними потом по единому принципу
        //
        //Dynamic Array - структура данный по названию динамический массив, который может расшятся - реализован ArrayList


        int[] ints = {1,2,3,5,7,0};
        int num = ints[3]; //достать или обратится к элементу по индексу
        String arrayAsString = Arrays.toString(ints);
        //System.out.println(ints);
        System.out.println(arrayAsString);//для вывода в консоль преобразуем в строку


        //Object[] elementData = new Object[10];
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1); //
        integers.add(3);
        int numArrList = integers.get(1); //достать или обратится к элементу по индексу
        System.out.println(integers);
        
    }
}
