package javaPro._01_28.task2;

import javaPro._01_21.Animal;
import javaPro._01_21.Cat;
import javaPro._01_21.Dog;
import javaPro._01_21.Person;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int bigInt = 1000;
        int smallInt = 80;
        byte byte1 = (byte) smallInt;
        smallInt = byte1;

        Object object1 = new Cat("Timmy");
        Object object2 = new Person(LocalDate.now());


        //Upcasting
        Animal animal1 = new Cat("Timmy");
        Animal animal2 = new Dog("Bim");


        //downcasting
        Cat cat = (Cat) animal1; // приведение щбъекта типа animal1 к объукеу типа Cat
        cat.meow();


        int primitiveInt = 0;

        //autoboxing
        //What we see
        Integer objectInt1 = 123;   //what see compilator
        // Integer objectInt2 = Integer.valueOf(123);

//unboxing
        //What we see
        primitiveInt = objectInt1;
        //what see compilator
        //primitiveInt = objectInt1.intValue();
        char primitiveC = 'c';
        Character objectC = 'c';

        Integer objectInt2 = 321;

     printPrimitive(primitiveInt); //unboxing
        System.out.println(objectInt1 + objectInt2);

        BigDecimal bigDecimal1 = BigDecimal.ONE;
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        System.out.println(bigDecimal1.add(bigDecimal2));

    }
    public static  void  printObject(Integer object){
        System.out.println(object);
    }

    public static void printPrimitive(int primitive){
        System.out.println(primitive);
    }
}
