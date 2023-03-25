package GameElement;

public class Enemy extends Character {
    private int lifePoint;
    private int maxLifePoint;
    private String name;
    private int accuracy;
    private int damage;
    private int resistance;

    public Enemy(int lifePoint, int maxLifePoint, String name, int accuracy, int power, int efficiencyPotions, int resistance) {
        super(lifePoint, maxLifePoint, name, accuracy, power, efficiencyPotions, resistance);
    }


}
