package homeworks._02_07;

public class Job {
    private String jobTitle;
    private int salary;

    public Job(String jobTitle, int salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, если объекты идентичны
        if (this == obj) return  true;
        // Проверяем, если объект null или другого класса
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;// Приводим obj к типу Job
        return salary == job.salary && jobTitle.equals(jobTitle);// Сравниваем поля
    }

    @Override
    public int hashCode() {
        // Генерируем hashCode на основе полей
        int result = jobTitle.hashCode();
        result = 31 * result + salary; // Умножаем на 31, чтобы уменьшить вероятность коллизий
        return result;
    }

    public int getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
