package dercochenko.com.Modules.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int size;
        String flightDestinationName, numberAircraft;
        int inputType;
        int type;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size arr");
        size = scanner.nextInt();

        Belavia[] belavias = new Belavia[size];
        String[] typesPlane = new String[]{"Passenger", "Cargo"};

        for (int i = 0; i < size; i++) {
            System.out.println("Enter information about " + (i + 1) + " flight");

            System.out.println("enter flight destination name: ");
            flightDestinationName = new Scanner(System.in).nextLine();

            System.out.println("Number aircraft: ");
            numberAircraft = new Scanner(System.in).nextLine();

            System.out.println("Type aircraft: " + "\n1)" + typesPlane[0] + "\n2)" + typesPlane[1]);
            type = new Scanner(System.in).nextInt();

            belavias[i] = new Belavia(flightDestinationName, numberAircraft, typesPlane[type-1]);
        }

        System.out.println("Type aircraft: " + "\n1)" + typesPlane[0] + "\n2)" + typesPlane[1]);
        inputType = new Scanner(System.in).nextInt();
        printFlightFromType(typesPlane[inputType-1], belavias);


    }

    public static void printFlightFromType(String type, Belavia[] belavias) {
        for (Belavia b :
                belavias) {
            if (b.getType().equalsIgnoreCase(type)) {
                System.out.println(b);
            }
        }
    }
}

