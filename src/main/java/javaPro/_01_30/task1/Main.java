package javaPro._01_30.task1;

/**
 * +
 * Alexandra Kriviz left
 * <p>
 * teacher15 starta.university 11:41
 * Битва за средиземье. Властелин колец
 * Создать систему классов, представляющих различные расы из Властелина Колец: Люди, Эльфы, Гномы, Орки, Варги, Назгулы
 * Все расы имеют следующие характеристики: имя, здоровье, сила, защита. А так же способности: атаковать и получать урон.
 * При атаке значение урона рассчитывается как сила атакующего / защита цели атаки. Так же при атаке выводить в консоль сообщение в формате “<name> attacks <name> for <damage value> damage.”.
 * При получении урона от здоровья цели отнимается значение урона, и так же выводится сообщение “<name> takes <damage value> damage from <name>”. И если здоровье опускается до нуля – герой умирает и выводится сообщение “<name> dies”, либо выводится сообщение “<name> remains <health value> health”.
 * Переопределить метод toString() так, что бы у каждого персонажа выводилась его раса, имя и текущее здоровье;
 * Кроме этого у каждой расы есть особенности:
 * Люди – имеют шанс нанести критический урон (урон умноженный на множитель критического урона);
 * Эльфы – имеют шанс уклониться от любой атаки;
 * Гномы – имеют дополнительную защиту (защита умноженная на множитель брони);
 * Орки – имеют способность “Ярость”: Чем меньше у орка здоровья – тем выше его сила. (Например если здоровья на 30% меньше максимального здоровья, то сила выше на 30%. Если меньше на 90% - то сила выше на 90%);
 * Варги – при атаке (независимо от результата) исцеляются на показатель исцеления
 * Назгулы – имеют шипастую броню: При нанесении урона назгулу, атакующий так же получает урон в размере соответствующей характеристики.
 * Создать отряды “сил Мордора” и “защитников Средиземья”. Устроить битву между двумя отрядами, битва идёт до тех пор пока в одном из отрядов не останется живых героев.
 */
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Human1", 100, 60, 3, 2, 40);
        Elf elf1 = new Elf("Elf1", 80, 70, 2, 20);
        Dwarf dwarf1 = new Dwarf("Dwarf1", 150, 110, 5, 2);
        Orc orc1 = new Orc("Orc1", 110, 100, 2);
        Warg warg1 = new Warg("Warg1", 80, 90, 2, 7);
        Nazgul nazgul1 = new Nazgul("Nazgul1", 150, 120, 6, 10);
        Army army1 = new Army(new Hero[]{human1, elf1, dwarf1});
        Army army2 = new Army(new Hero[]{nazgul1, orc1, warg1});

        //elf.attack(nazgul);

        fight(army1, army2);
    }

    public static void fight(Army army1, Army army2) {
        System.out.println("Start buttle!");

        while (army1.isAlive() && army2.isAlive()) {

            System.out.println("Army 1 attack!");
            army1.attack(army2);
            System.out.println("Army 2 attack!");
            army2.attack(army1);


            System.out.println("War is finshed!");
            if (army1.isAlive()) {
                System.out.println("Army 1 is win!");
            } else if (army2.isAlive()) {
                System.out.println("Army 2 is win!");
            } else {
                System.out.println("No winners!");
            }
        }
    }
}
