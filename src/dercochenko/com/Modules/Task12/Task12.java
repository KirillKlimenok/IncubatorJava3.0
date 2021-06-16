package dercochenko.com.Modules.Task12;


import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        try {
            stackOverflowFunk();
        } catch (StackOverflowError e) {
            System.out.println(e);
        }
        if (new Scanner(System.in).nextBoolean())
            try {
                long[] l = new long[Integer.MAX_VALUE];
            } catch (OutOfMemoryError e) {
                System.out.println(e);
            }
    }

    public static void stackOverflowFunk() {
        int k = 0;
        stackOverflowFunk();
    }
}
