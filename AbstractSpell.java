package GameElement;

public abstract class AbstractSpell {
    private String name;
    private int damage;
    private int accuracy;
    private int resistance;
    private String type;

    public AbstractSpell(String name, int damage, int accuracy, int resistance, String type) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.resistance = resistance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getResistance() {
        return resistance;
    }
}
