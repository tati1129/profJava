package javaPro3._05_15.cat;

public class CatService {

    public void catBirthay(Cat cat){
        System.out.println("Сегодня у питомца день рождения!");
        cat.setAge(cat.getAge()+1);
    }
}
