package GameElement;

import java.util.Random;

public class Wand {
    private int size;
    private Core core;


    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setCore(Core core) {
        this.core = core;
    }

    public Core getCore() {
        return core;
    }

    public Wand() {
        Random random = new Random();
        this.core = Core.values()[random.nextInt(Core.values().length)];
        this.size = random.nextInt(15) + 22;
        System.out.println("Votre baguette est de taille " + this.size + " et de coeur " + this.core.type + "."+" Cette baguette vous convient parfaitement !");

    }

}
