package dercochenko.com.Modules.Task4;

import java.util.Scanner;

public class Task4E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter You line:");
        printOnlyLoverCase(scanner.nextLine());
        System.out.println("Enter You line:");
        printOnlyLoverCase(scanner.nextLine());
        System.out.println("Enter You line:");
        printOnlyLoverCase(scanner.nextLine());
        System.out.println("Enter You line:");
        printOnlyLoverCase(scanner.nextLine());
    }

    public static void printOnlyLoverCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
