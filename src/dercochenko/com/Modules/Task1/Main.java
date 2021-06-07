package dercochenko.com.Modules.Task1;

public class Main {
    public static void main(String[] args) {
        Class<Main> cl = Main.class;
        System.out.println(cl.getClassLoader());
        System.out.println(cl.getClassLoader().getParent());
        System.out.println(cl.getClassLoader().getParent().getParent());

        System.out.println("ArrayList:");

        Class<Integer> integer = Integer.class;
        Integer i = 1;
        System.out.println(i + " | " + integer.getClassLoader()); // null  because the bootstrap class loader is written in native code, not Java – so it doesn't show up as a Java class

        System.out.println("MyClass:");
        Class<MyClass> myClass = MyClass.class;
        System.out.println(myClass.getClassLoader());
        System.out.println(myClass.getClassLoader().getParent());
        System.out.println(myClass.getClassLoader().getParent().getParent());

    }
}

class MyClass{}
