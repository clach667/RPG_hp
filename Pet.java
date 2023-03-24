package GameElement;


public enum Pet {

    OWL("Owl"),

    RAT("Rat"),

    CAT("Cat"),

    TOAD("Toad");

    public final String type;
    Pet(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
