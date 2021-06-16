package dercochenko.com.Modules.Task11;

public class Task11 {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        aDog = foo(aDog);

        System.out.println("In main: ");

        System.out.println(aDog.getName().equals("Max"));
        System.out.println(aDog.getName().equals("Fifi"));

        System.out.println(aDog == oldDog);
    }

    public static Dog foo(Dog d) {
        System.out.println("In Method: ");

        System.out.println(d.getName().equals("Max"));

        d = new Dog("Fifi");

        System.out.println(d.getName().equals("Fifi"));
        return d;
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
