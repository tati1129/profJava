package practice._01_28;

public class App {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        Fish fish = new Fish();
        Horse horse = new Horse();
        Lion lion = new Lion();

        Animal[] animals = {dolphin, fish, horse, lion};

        action(animals);

        EarthAnimal horse1 = new Horse();
        Animal horse2 = new Horse();

    }

    public static void action(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof WaterAnimal) {
                WaterAnimal waterAnimal = (WaterAnimal) animal;
                waterAnimal.swim();
            } else if (animal instanceof EarthAnimal) {
                EarthAnimal earthAnimal = (EarthAnimal) animal;
                earthAnimal.walk();
                if (animal instanceof Horse) {
                    ((Horse) animal).jump();
                }
            }
        }

    }

}
