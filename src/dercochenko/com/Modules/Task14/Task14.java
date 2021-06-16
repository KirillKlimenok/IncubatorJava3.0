package dercochenko.com.Modules.Task14;

public class Task14 {

    public static void main(String[] args) {
        Animal[] herd = {new Horse("Horse", 4, false),
                new Horse("Horse 1", 4, false), new Kangaroo("Kangaroo", 4, true),
                new Kangaroo("Kangaroo 1", 4, true), new Dragonfly("Dragonfly", 6, true),
                new Dragonfly("Dragonfly 1", 6, true), new Animal("Unknown", 10, true)};

        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly", 6, true);

        for (Animal e:
            herd) {
            e.voice();
            e.move();
            e.isHungry();
        }
    }
}

interface Movable {
    void voice();
}

interface Voiceable {
    void move();
}

interface Starveble {
    void isHungry();
}

