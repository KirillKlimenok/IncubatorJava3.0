package dercochenko.com.Modules.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Week week;
        Scanner scanner = new Scanner(System.in);
        int id = 0;

        while (true) {
            System.out.println("Enter day: ");
            id = scanner.nextByte();
            week = Week.getDay(id);

            if (week==null) break;

            printInformationAboutDay(week);

            System.out.println("try again? \n" + "Enter 'true' or 'false' ");
            if (!scanner.nextBoolean()) break;

        }
    }

    public static void printInformationAboutDay(Week week) {
        if (week.isWeekend()) {
            System.out.println("Weekend: " + week.name);
        } else {
            System.out.println("workday: " + week.name);
        }
    }

    enum Week {
        MON(1, false, "Monday"),
        TUE(2, false, "Tuesday"),
        WED(3, false, "Wednesday"),
        THU(4, false, "Thursday"),
        FRI(5, false, "Friday"),
        SAT(6, true, "Saturday"),
        SUN(7, true, "Sunday"),
        ;
        private final int id;
        private final boolean weekend;
        public final String name;


        Week(int i, boolean b, String name) {
            this.id = i;
            this.weekend = b;
            this.name = name;
        }

        public boolean isWeekend() {
            return weekend;
        }

        public static Week getDay(int id) {
            switch (id) {
                case 1: {
                    return MON;
                }
                case 2: {
                    return TUE;
                }
                case 3: {
                    return WED;
                }
                case 4: {
                    return THU;
                }
                case 5: {
                    return FRI;
                }
                case 6: {
                    return SAT;
                }
                case 7: {
                    return SUN;
                }
                default: {
                    System.err.println("you enter incorrect data");
                    return null;
                }
            }
        }

    }
}
