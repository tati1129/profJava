package practice._01_23.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Fish & Chiken", "Europe", "Meow", "black", "britain"),
        new Dog("Cow meat", "Europe", "Gav", "Taksa", 7), new Horse("Herbs & vegetables", "Asia", "iiia", "Black&White", 13)};

        Vet vet = new Vet();

        for (Animal animal : animals){
            vet.treatAnimal(animal);
            animal.makeNoise();
        }
    }
}
