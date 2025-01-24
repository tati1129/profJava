package javaPro._25_01_21;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    //private int age;
    private LocalDate dateBirth;

    public Person(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        return this.dateBirth.equals(p.dateBirth);
    }
}
