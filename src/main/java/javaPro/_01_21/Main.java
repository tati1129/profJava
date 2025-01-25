package javaPro._01_21;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(LocalDate.of(1990, 1, 1));
        Person person2 = new Person(LocalDate.of(1990, 1, 1));
        //System.out.println(person1.equals(person2)); // false

        BankAccount bankAccount = new BankAccount(1000, 0);
        //makePay(-100, bankAccount);

        Account account = new Account(1000, 0);
        System.out.println(account);
        account.makePay(100);
        System.out.println(account);


        Cat cat = new Cat("Mur");
        Dog dog = new Dog("Sam");

        cat.voice();
        dog.voice();

        Animal animal1 = new Cat("Kot");
        Animal animal2 = new Dog("Rich");
        Animal animal3 = new Animal();


        // полиморфизм: есть родитель и 2наследника, и можно через родителя обращаться напрямую к наседникам,
        // т.е. у класса родителя есть способность обращаться к наследнику так как буд-то они принадлежат родителю
        animal1.voice();// Kot говорит мяу
        animal2.voice();// Rich говорит гав
        animal3.voice();//Какое то животное издает звук

    }

    public static void makePay(int amount, BankAccount bankAccount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount не может быть отрицательной");
        }
        if (amount > bankAccount.getBalance()) {
            throw new IllegalArgumentException("не достаточно средств");
        }
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        bankAccount.setHold(bankAccount.getHold() + amount);
    }

}
