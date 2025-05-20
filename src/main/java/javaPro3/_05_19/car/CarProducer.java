package javaPro3._05_19.car;

public class CarProducer {
    private String title;
    private String country;

    public CarProducer(String title, String country) {
        this.title = title;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "carProducer{" +
                "title :" + title +
                ", country :" + country +
                '}';
    }
}
