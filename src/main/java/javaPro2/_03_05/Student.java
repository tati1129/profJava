package javaPro2._03_05;

public class Student {
    //зависимость это объект какого-то класса, который выступает в качестве поля другого класса
    private Day[] learningDays = new Day[4];

    public Student(Day first, Day second, Day third, Day fourth) {
        learningDays[0] = first;
        learningDays[1] = second;
        learningDays[2] = third;
        learningDays[3] = fourth;
    }

//    public boolean isGoStudy(DayOfWeek day){
//        for (DayOfWeek d : learningDays){
//            if (d.equals(day)){
//                return true;
//            }
//        }
//        return false;
//    }

    //зависимость
}
