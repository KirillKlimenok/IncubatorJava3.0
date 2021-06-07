package dercochenko.com.Modules.Task4;

import java.util.Scanner;

public class Task4K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Java", str2 = "JAVA", str3 = "C#", str4 = "Java";

        System.out.println(str1.equals(str2) + " " + str1.equals(str3) + " " + str1.equals(str4) + " " + str2.equals(str3) + " " + str2.equals(str4) + str3.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str4);

        str1 = "JavaJava";
        System.out.println(str1.substring(4) == str4);
        System.out.println(str1 == null);

        str1 = null;
        System.out.println(str1 == null);
    }

}
