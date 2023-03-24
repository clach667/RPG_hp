package GameElement;

import java.util.Random;

public class SortingHat {
    public static String house;
    static String setHouse;
    public void sortingHat() {
        int rnd = new Random().nextInt(House.HOUSES.length);
        this.house =  House.HOUSES[rnd];
        System.out.println("Le Choixpeau magique vous a attribué la maison " + this.house + " !");
    }
}
