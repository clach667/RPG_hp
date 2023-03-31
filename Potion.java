package GameElement;

public class Potion {
    public String name;
    public int healPoint;
    public int price;

    public Potion(String name, int healPoint, int price) {
        this.name = name;
        this.healPoint = healPoint;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getHealPoint() {
        return healPoint;
    }
    public int getPrice() {
        return price;
    }

    public static Potion GingerRoot() {
        Potion potion = new Potion("Ginger Root", 30,30);
        return potion;
    }

    public static Potion MandrakeRoot() {
        Potion potion = new Potion("Mandrake Root", 50,40);
        return potion;
    }

    public static Potion DragonBlood() {
        Potion potion = new Potion("Dragon Blood", 100,100);
        return potion;
    }


}


