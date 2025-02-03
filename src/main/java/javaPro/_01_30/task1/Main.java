package javaPro._01_30.task1;

/**
 * +
 * Alexandra Kriviz left
 *
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
}
