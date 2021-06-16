package dercochenko.com.Modules.Task14;

public class Kangaroo extends Animal{
    public Kangaroo(String name, int numberOfLegs, boolean hasMustache) {
        super(name, numberOfLegs, hasMustache);
    }

    @Override
    public void voice() {
        System.out.println("khe-khe");
    }

    @Override
    public void move() {
        System.out.println("jump-jump");
    }

    @Override
    public void isHungry() {
        System.out.println("I want berries");
    }
}
