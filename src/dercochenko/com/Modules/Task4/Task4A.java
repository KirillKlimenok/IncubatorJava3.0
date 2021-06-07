package dercochenko.com.Modules.Task4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task4A {
    public static void main(String[] args) {
        String inputLine = takeWordFromConsole();
        StringTokenizer stringTokenizer = new StringTokenizer(inputLine,"!?", true);
        while (stringTokenizer.hasMoreTokens()) System.out.print(stringTokenizer.nextToken());
    }

    public static String takeWordFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String word;
        String predWord = "";
        StringBuilder line = new StringBuilder();

        while (true) {
            System.out.println("Enter You Word");
            word = scanner.nextLine();

            if (word.equals(".")) break;
            else if (!word.equals(predWord)) {
                line.append(word).append(" ");
                predWord = word;
                if (word.charAt(word.length() - 1) == '.') break;
            }
        }
        return line.toString();
    }
}
