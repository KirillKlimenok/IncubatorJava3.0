package dercochenko.com.Modules.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        replacingSpaces(scanner.nextInt());
        replacingSpaces(scanner.nextInt());
        replacingSpaces(scanner.nextInt());
        replacingSpaces(scanner.nextInt());
    }

    public static void replacingSpaces(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            stringBuilder.append(scanner.nextLine());
            if (stringBuilder.isEmpty() || stringBuilder.toString().equals(" ")) {
                words[i] = "String is empty";
            } else {
                words[i] = stringBuilder.toString();
            }
            stringBuilder.delete(0, stringBuilder.length());
        }
        for (String s:
             words) {
            System.out.println(s);
        }
    }
}
