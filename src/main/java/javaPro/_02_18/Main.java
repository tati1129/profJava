package javaPro._02_18;



import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("1", "2", 3);
        Cat cat = new Cat("Boston", 7, "ginger");

        Map<Person, Cat> personCatMap = new HashMap<>();
        personCatMap.put(person, cat);

        System.out.println(personCatMap.get(person).getName());
        System.out.println(person.hashCode() + " hashCod");
        System.out.println((person.hashCode() % 16 )+ " это номер бакета (индекс ячейки массива) " );


        //person.setAge(4);
        person.setAge(3);

        System.out.println(person.hashCode() + " hashCod");
        System.out.println((person.hashCode() % 16 )+ " это номер бакета (индекс ячейки массива) " );
        System.out.println(personCatMap.get(person));

        String str = " ,  sd";
        System.out.println(str.trim());
    }
}
