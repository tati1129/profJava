package javaPro2._03_04;

public class Main {
    public static void main(String[] args) {
//        PetDog petDog = new PetDog(5,"Pomeranian", "Mic");
//        petDog.eat();
//        System.out.println(petDog);

        Bird bird1 = new Bird("Sparrow", 30);
        Bird bird2 = new Bird("Eagle", 50);

        Plane boing = new Plane(216840, 3220);

        Helicopter helicopter = new Helicopter(560, 115, "Airbus H130",237);

        Flyable[] flyables = {bird1, bird2, boing, helicopter};

        for (Flyable item : flyables){
            System.out.println(item.fly());
        }
    }
}
