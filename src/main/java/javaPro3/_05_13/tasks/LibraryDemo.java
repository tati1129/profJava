package javaPro3._05_13.tasks;

public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library("Humbolt library", "Warshawer str.23", 139);
        //Library library1 = new Library("Humbolt library", "Warshawer str.23", 139);
        library.printInfo();

        library.issueBook();
        library.issueBook();
        library.issueBook();

        library.printInfo();

        library.returnBook();

        library.printInfo();
    }

}
