package GameElement;

import java.util.Random;

public class SortingHat {
    public static String house;
    static String setHouse;
    public void sortingHat() {
        int rnd = new Random().nextInt(House.HOUSES.length);
        this.house =  House.HOUSES[rnd];
        System.out.println("Hmmm, Pour vous j'ai beaucoup de mal à trouver une maison. Huuum, Poufs... NON, cela ne va pas" +
                "... Ah oui, j'ai trouvé ! C'est " + this.house + " !");
    }
}
