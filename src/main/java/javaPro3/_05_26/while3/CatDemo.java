package javaPro3._05_26.while3;

import javaPro3._05_26.UserInputStatic;


public class CatDemo {
    public static void main(String[] args) {
        CatUtil util = new CatUtil();

        int catCountter = 1;

        while (catCountter <= 3) {

            Cat cat = util.createCat(catCountter);
            System.out.println("Кошка " + cat.getName() + " зарегистрирована в журнале посещений");
            catCountter++;
        }
        System.out.println("Приняли " + catCountter + "кошек. Прием окончен.");
    }
}
