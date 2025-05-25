package homeworks._05_22.task4;

public class TaskSchool {
    public static void main(String[] args) {
        /*
        Реализовать с использованием switch
        Ваш ребенок принес оценку за контрольную работу по математике. В школе 12 бальная система.
        Запишите в переменную случайное число от 0 до 12.
        Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.  (Оставшееся время не может быть больше 1 часа)
        На сегодня у него осталось 45 минут. (записать в переменную)


        Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
        от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
        от 4 до 6 -> Нейтральные слова + ко времени 15 минут
        3 -> Огорчитесь. Минус 30 минут ко времени
        оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено


        Выведите на экран оставшееся на сегодня время для просмотра ТВ
         */
        int grade = (int) (Math.random()*13);
        System.out.println("Оценка за сегодня : " + grade);
        reactions(grade);

        //reactions(11);

    }

    public static void reactions(int num) {
        int timeForTV = 45;


        switch (num) {
            case 0, 1, 2, 3:
                System.out.println("Трагедия. Сегодня ТВ смотреть запрещено");
                timeForTV -= 45;
                break;
            case 4, 5, 6:
                System.out.println("Надо стараться! Ты сможешь!");
                timeForTV += 15;
                break;
            case 7, 8, 9:
                System.out.println("Ты молодец!");
                timeForTV += 45;
                break;
            case 10, 11, 12:
                System.out.println("Мы очень рады! Ты такой умничка!");
                timeForTV += 60;
            default:
                System.out.println("Некорректная оценка.");
                return;
        }


        if (timeForTV > 60) {
            timeForTV = 60;
        }

        // Минимум — 0 минут
        if (timeForTV < 0) {
            timeForTV = 0;
        }
        System.out.println("Время просмотра TV сегодня : "+ timeForTV);
    }

}
