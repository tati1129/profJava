package javaPro._02_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person{
    private String firstName;
    private String lastName;
    private int age;
    final private List<String> preferences = new ArrayList<>();

    public Person(String firstName, String lastName, int age,List<String> preferences) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.preferences.addAll(preferences);
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPreferences() {
        return preferences;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}


