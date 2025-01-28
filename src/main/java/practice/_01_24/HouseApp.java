package practice._01_24;

/**
 * Создайте систему классов которая будет представлять собой жителей дома.
 * Классы Cat, Dog, Mouse, Human, Robot. Абстракции придумать самостоятельно.
 * <p>
 * Каждое существо должно:
 * -иметь имя.
 * -уметь представляться (метод sayHello) – в котором выводится в консоль имя и представление существа.
 * Например: для кота “Meow! I'm cat. My name is <имя>"; для собаки “Bark! I'm dog. My name is <имя>”;
 * и далее для остальных по аналогии.
 * -уметь играть с другим существом (метод play, который принимает другое существо для игры) –
 * в котором по умолчанию выводится сообщение “<имя1> playing with <имя2>” (если играют кот и собака, то выводить
 * “Dog <имя1> barks. Cat <имя2> runs away”).
 * <p>
 * Каждое одушевлённое существо (все кроме робота) должно:
 * -иметь возраст,
 * -уметь стареть (метод grow) при вызове которого возраст увеличивается на 1, а так же выводится сообщение “<имя>
 * is getting older by 1 year”.
 * <p>
 * Каждое животное должно:
 * -иметь булевый параметр isHungry,
 * -уметь есть (метод eat) при вызове которого, в зависимости от параметра isHungry выводить сообщение "<имя> eats"
 * либо "<имя> doesn't want to eat". Если животное поело – менять параметр isHungry на false.
 * <p>
 * Человек должен уметь кормить (метод feed) одно или несколько животных, которые были переданы в метод.
 * В методе у каждого животного вызывается метод eat.
 * <p>
 * Человек и робот должны уметь выгуливать животное (метод walkAnimal), которое передаётся в метод.
 * Вывести сообщение "<имя1>  walking with <имя2>". После прогулки животное проголодается, перевести isHungry на true.
 * <p>
 * Кот и робот должны уметь ловить мышь (метод catchMouse), которая передаётся в метод.
 * Вывести сообщение "<имя1> catches mouse <имя2>"
 * <p>
 * Реализовать абстракции так, что бы характеристики и тела методов в классах не повторялись.
 * В классе HouseApp, в мэйн методе создать объекты всех возможных существ, а так же методы:
 * -greetings – метод в котором у всех существ вызывается sayHello
 * -playEachOther – метод в котором все существа поочерёдно играют друг с другом
 * - метод walkAnimals – в котором все, кто умеет выгуливать по очереди выгуливают всех животных
 * (мышь выгуливать не обязательно )
 * - метод allCatchMouse – в котором все, кто умеет ловить мышь по очереди ловят мышь.
 * - метод gettingOlder – в котором все одушевлённые стареют.
 * <p>
 * По возможности все циклы писать через foreach.
 */

public class HouseApp {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom", 7, "grey");
        Dog dog = new Dog("Sam", 8, "cocker spaniel");
        Mouse mouse = new Mouse("Jerry", 3);
        Human human = new Human("Antony", 34);
        Robot robot = new Robot("R2D2");

        Creature[] creatures = {cat, dog, mouse, human, robot};
        AnimalWallkers[] animalWallkers = {human, robot};
        MouseCatcher[] mouseCatchers = {cat, robot};
        Animal[] houseAnimals = {cat, dog};
        Animated[] animateds = {human, dog, cat, mouse};

        human.feed(cat);
        human.feed(cat, dog, mouse);
        human.feed(houseAnimals);
        robot.catchMouse(mouse);

        System.out.println("___________________");
        greetings(creatures);

        System.out.println("___________________");
        playEachOther(creatures);

        System.out.println("___________________");
        allCatchMouse(mouseCatchers,mouse);

        System.out.println("___________________");
        gettingOlder(animateds);
    }

    public static void greetings(Creature[] creatures) {
        for (Creature creature : creatures) {
            creature.sayHello();
        }
    }

    public static void playEachOther(Creature[] creatures) {
        for (int i = 0; i < creatures.length; i++) {
            for (int j = i + 1; j < creatures.length; j++) {
                creatures[i].playing(creatures[j]);
            }
        }

    }

    public static void walkAnimals(AnimalWallkers[] animalWallkers, Animal[] animals) {
        int walkerIndex = 0;
        for (Animal animal : animals) {
            if (walkerIndex == animalWallkers.length) {
                walkerIndex = 0;
            }
            animalWallkers[walkerIndex++].walkAnimal(animal);
        }
    }

    public  static void  allCatchMouse(MouseCatcher[] mouseCatchers, Mouse mouse){
        for (MouseCatcher mouseCatcher : mouseCatchers){
            mouseCatcher.catchMouse(mouse);
        }
    }

    public static void gettingOlder(Animated[] animateds){
        for (Animated animated : animateds){
            animated.grow();
        }
    }
}


