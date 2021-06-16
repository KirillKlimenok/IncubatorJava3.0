package dercochenko.com.Modules.Task14;

public class Horse extends Animal{
    public Horse(String name, int numberOfLegs, boolean hasMustache) {
        super(name, numberOfLegs, hasMustache);
    }

    @Override
    public void voice() {
        System.out.println("i-go-go");
    }

    @Override
    public void move() {
        System.out.println("top-top");
    }

    @Override
    public void isHungry() {
        System.out.println("I want hay");
    }
}
