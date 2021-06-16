package dercochenko.com.Modules.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();

        System.out.println(myClassLoader.findClass(Class.forName("D:\\IncubatorJava3.0\\src\\dercochenko\\com\\Modules\\Task2\\Main.java").getName()).getClassLoader());
    }
}

class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = new byte[0];


        try {
            bytes = Files.readAllBytes(Paths.get("D:\\IncubatorJava3.0\\src\\dercochenko\\com\\Modules\\Task2\\MyClassLoader.class"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defineClass(name, bytes, 0, bytes.length);
    }
}
