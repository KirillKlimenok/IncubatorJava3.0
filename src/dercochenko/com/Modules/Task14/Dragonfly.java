package dercochenko.com.Modules.Task14;

public class Dragonfly extends Animal{
    public Dragonfly(String name, int numberOfLegs, boolean hasMustache) {
        super(name, numberOfLegs, hasMustache);
    }

    @Override
    public void voice() {
        System.out.println("bj-w-w");
    }

    @Override
    public void move() {
        System.out.println("flight");
    }

    @Override
    public void isHungry() {
        System.out.println("I want insects");
    }
}
