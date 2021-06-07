package dercochenko.com.Module1.Task4;

import java.util.Scanner;

public class Task4D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter You line:");
        deleteSpace(scanner.nextLine());
        System.out.println("Enter You line:");
        deleteSpace(scanner.nextLine());
        System.out.println("Enter You line:");
        deleteSpace(scanner.nextLine());
        System.out.println("Enter You line:");
        deleteSpace(scanner.nextLine());
    }

    public static void deleteSpace(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
