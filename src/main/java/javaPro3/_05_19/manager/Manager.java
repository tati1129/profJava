package javaPro3._05_19.manager;

public class Manager {
    private String name;
    private String email;

    public Manager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
