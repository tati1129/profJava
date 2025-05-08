package javaPro2._03_05;

public class DayOfWeek {
    private String nameOfTheDay;

    public DayOfWeek(String nameOfTheDay) {
        this.nameOfTheDay = nameOfTheDay;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DayOfWeek) {
            //если nameOfTheDay текущего объекта равен переданному объекту тогда оны равны
            if (this.nameOfTheDay.equals(((DayOfWeek) obj).nameOfTheDay)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
