package dercochenko.com.Module1.Task4;

import java.util.Scanner;

public class Task4C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        flipWord(scanner.nextLine());
        flipWord(scanner.nextLine());
        flipWord(scanner.nextLine());
        flipWord(scanner.nextLine());
    }

    public static void flipWord(String str) {
        for (int i = str.length() - 1; i > -1; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
