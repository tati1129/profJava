package javaPro3._13_05.tasks.newTask;

public class LibraryDemo {
    public static void main(String[] args) {
        Library book1 = new Library("Фёдор Достоевский", "Преступление и наказание");
        book1.createInfo(123, 560, true);
        book1.printInfo();
        book1.handoutBook();
        book1.printInfo();


    }
}
