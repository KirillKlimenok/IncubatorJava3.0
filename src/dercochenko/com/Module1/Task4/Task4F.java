package dercochenko.com.Module1.Task4;

import java.util.Scanner;

public class Task4F {
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
            if (i % 2 != 0) {
                stringBuilder.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(stringBuilder);
    }
}

