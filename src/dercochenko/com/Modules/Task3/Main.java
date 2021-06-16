package dercochenko.com.Modules.Task3;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/*
* Вторая часть задания:
1. Загрузите полученный файл .jar с помощью класса URLClassLoader (создайте объект этого класса и
передайте его, в конструктор передайте массив URL - адресов с одной строкой-путь к вашему файлу jar).
2. Получите объект класса из файла jar (используйте метод newInstance() для результирующего объекта
типа Class). Вызовите метод, который может выводить что - то на консоль. Вот
обработка исключений (в 8 модулях вы познакомитесь), поэтому, если вы не знакомы с этой темой,
просто скопируйте приведенный ниже код и замените имена переменных своими собственными.*/
public class Main {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        URL url = new URL(new File("D:\\IncubatorJava3.0\\out\\artifacts\\IncubatorJava3_0_jar\\IncubatorJava3.0.jar").toURI().toURL().toString());
        URLClassLoader urlClassLoader = URLClassLoader.newInstance(new URL[]{url});

        Class<?> aClass = urlClassLoader.loadClass("dercochenko.com.Modules.Task3.Main");
        Main main =(Main) aClass.newInstance();
        main.printInfo();
    }
    public void printInfo (){
        System.out.println("Hi");
    }
}
