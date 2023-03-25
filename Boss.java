package GameElement;

public class Boss {
    private int lifePoint;
    private int maxLifePoint;
    private String name;
    private int accuracy;
    private int damage;
    private int resistance;

    public Boss(int lifePoint, int maxLifePoint, String name, int accuracy, int damage, int resistance) {
        this.lifePoint = lifePoint;
        this.maxLifePoint = maxLifePoint;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
    }
    public void Troll() {
        this.lifePoint = 100;
        this.maxLifePoint = 100;
        this.name = "Troll";
        this.accuracy = 50;
        this.damage = 20;
        this.resistance = 0;
    }
}
