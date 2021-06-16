package dercochenko.com.Modules.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello");
        MyClassLoader myClassLoader = new MyClassLoader();
        System.out.println(myClassLoader.findClass("dercochenko.com.Modules.Task2.Main").getClassLoader());
    }
}
class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get("D:\\IncubatorJava3.0\\src\\dercochenko\\com\\Modules\\Task2\\Task2.class"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return defineClass(name, bytes, 0, bytes.length);
    }
}
