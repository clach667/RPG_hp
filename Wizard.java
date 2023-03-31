package GameElement;


import java.util.ArrayList;
import java.util.List;

public class Wizard extends Character {

    private Pet pet;

    private Wand wand;

    private String house;

    public static List<Spell> knownSpells;

    public List<Potion> potions;


    public void defend() {
    }

    public Wizard(String name, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions) {
        super(200, 200, name, 50, 40, 1, 10);
        this.pet = pet;
        this.wand = wand;
        this.knownSpells = knownSpells;
        this.house = String.valueOf(SortingHat.house);
        this.potions = potions;
    }


    public void addPotion(Potion potion) {
        this.potions.add(potion);
    }


    public String getHouse() {
        return this.house;
    }

    public Wand getWand() {
        return wand;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWand(Wand wand) {
        this.wand = wand;

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setHouse(House house) {
        this.house = String.valueOf(SortingHat.house);
    }

    public void setWand(Core core, int size) {
        this.wand = new Wand(core, size);
    }


    public String getknownSpell() {
        return String.valueOf(knownSpells);
    }

    public void addSpell(Spell spell) {
        this.knownSpells.add(spell);
    }


    public void setknownSpell(String wingardiumLeviosa) {
        this.knownSpells = knownSpells;
    }

    public String getlifePoint() {
        return String.valueOf(lifePoint);
    }

    public String getPotion() {
        return String.valueOf(potions);
    }
}
