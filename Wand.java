package GameElement;

import java.util.Random;

public class Wand {
    private Wand wand;
    private int size;
    private Core core;

    public Wand(Core core, int size) {
        this.core = core;
        this.size = size;
    }


    public void setSize() {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setCore() {
        this.core = core;
    }

    public Core getCore() {
        return core;
    }

    public Wand(Wand wand) {
        this.wand = wand;
        Random random = new Random();
        this.core = Core.values()[random.nextInt(Core.values().length)];
        this.size = random.nextInt(15) + 22;


    }


}
