package javaPro2._03_05;

public class Student {
    //зависимость это объект какого-то класса, который выступает в качестве поля другого класса
    private DayOfWeek[] learningDays = new DayOfWeek[4];

    public Student(DayOfWeek first, DayOfWeek second, DayOfWeek third, DayOfWeek fourth) {
        learningDays[0] = first;
        learningDays[1] = second;
        learningDays[2] = third;
        learningDays[3] = fourth;
    }

    public boolean isGoStudy(DayOfWeek day){
        for (DayOfWeek d : learningDays){
            if (d.equals(day)){
                return true;
            }
        }
        return false;
    }

    //зависимость
}
