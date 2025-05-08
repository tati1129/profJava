package javaPro2._03_04;

public class PetDog extends Dog {
    private String name;

//    public PetDog(String breed, int age, String name) {
//        //конструкторы родителя не наследуются, они вызываются в наследнике с помощью super(breed, age);
//        super(breed, age);
//        this.name = name;
//    }
//
//    public PetDog(String name){
//        this.name = name;
//    }
//
//    public PetDog(){
//
//    }


    public PetDog(int age, String breed, String name) {
        //конструкторы родителя не наследуются, они вызываются в наследнике с помощью super(breed, age);
        super(age, breed);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating from a bowl");
    }

    @Override
    public String toString(){
        return name + " " + getBreed() + " " + getAge();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
