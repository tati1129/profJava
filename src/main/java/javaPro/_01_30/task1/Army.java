package javaPro._01_30.task1;

import java.util.Arrays;

public class Army {

    private Hero[] heroes;

    public Army(Hero[] heroes) {
        this.heroes = heroes;
    }

    public Hero[] getHeroes() {
        return heroes;
    }

    public boolean isAlive() {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].isAlive()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(heroes);
    }

    public void attack(Army armyEnemies){
        int indexEnemy = 0;
        for (int i = 0; i < getHeroes().length; i++) {
            if (indexEnemy >= armyEnemies.getHeroes().length) {
                indexEnemy = 0;
            }

            Hero hero1 = getHeroes()[i];
            if (!hero1.isAlive()) {
                continue;
            }
            Hero hero2 = armyEnemies.getHeroes()[indexEnemy];
            if (!hero2.isAlive()){
                indexEnemy = 0;
            }
            while (!hero2.isAlive() && indexEnemy < armyEnemies.getHeroes().length) {
                if (indexEnemy == armyEnemies.getHeroes().length){
                    indexEnemy = 0;
                }
                hero2 = armyEnemies.getHeroes()[indexEnemy++];
            }
            if (!hero2.isAlive()) {
                break;
            }
            hero1.attack(hero2);
            indexEnemy++;
        }
    }
}
