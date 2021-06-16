package dercochenko.com.Modules.Task14;

public class Animal implements Movable, Voiceable, Starveble{
    private String name;
    private final int numberOfLegs;
    private boolean hasMustache;

    public Animal(String name, int numberOfLegs, boolean hasMustache) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasMustache = hasMustache;
    }

    public Animal() {
        this.name = "default";
        this.numberOfLegs = 4;
        this.hasMustache = false;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasMustache() {
        return hasMustache;
    }

    public void setHasMustache(boolean hasMustache) {
        this.hasMustache = hasMustache;
    }

    @Override
    public void voice() {
        System.out.println("Voice");
    }

    @Override
    public void move() {
        System.out.println("Animal move");
    }

    @Override
    public void isHungry() {
        System.out.println("Animal don't want eat");
    }
}
