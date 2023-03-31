package GameElement;

public class Boss {

    public static int lifePoint;
    public int maxLifePoint;
    public String name;
    public int accuracy;
    public int damage;
    private int resistance;

    public Boss(int lifePoint, int maxLifePoint, String name, int accuracy, int damage, int resistance) {
        this.lifePoint = lifePoint;
        this.maxLifePoint = maxLifePoint;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
    }

    public static Boss Detractor() {
        Boss boss = new Boss(200, 200, "Detractor", 50, 50, 0);
        return  boss;
    }

    public int getResistance() {
        return resistance;
    }

    public int getDamage() {
        return damage;
    }

    public int getlifePoint() {
        return lifePoint;
    }

    public int getMaxLifePoint() {
        return maxLifePoint;
    }

    public String getName() {
        return name;
    }

    public int getAccuracy() {
        return accuracy;
    }


}

