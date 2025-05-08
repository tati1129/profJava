package javaPro2._03_05;

public class Auditory {
    private int capacity;
    private String number;

    public Auditory(int capacity, String number) {
        this.capacity = capacity;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auditory) {
            if (this.capacity == ((Auditory) obj).capacity && this.number.equals(((Auditory) obj).number)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
