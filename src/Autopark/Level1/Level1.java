package Autopark.Level1;

public class Level1 {
    public static void main(String[] args) {
        //1
        VehicleType[] types = new VehicleType[]{
                new VehicleType("Bus", 1.2),
                new VehicleType("Car", 1),
                new VehicleType("Rink", 1.5),
                new VehicleType("Tractor", 1.2)};
        //2
        printAllVehicles(types);

        //3
        types[types.length - 1].setTaxCoefficient(1.3);

        //4
        System.out.println("Max coefficient: " + getMaxCoefficient(types));

        //5
        System.out.printf("Average coefficient: %.2f \n", getAverageCoefficient(types));

        //6
        double max = -1;
        double averageCoefficient = 0.0;

        System.out.println("________________________");

        for (VehicleType v : types) {
            v.display();
            if (v.getTaxCoefficient() > max) max = v.getTaxCoefficient();
            averageCoefficient += v.getTaxCoefficient() / (types.length - 1);
        }

        System.out.println("Max coefficient: " + max);
        System.out.printf("Average coefficient: %.2f", averageCoefficient);
    }

    public static void printAllVehicles(VehicleType[] vehicleTypes) {
        for (VehicleType v : vehicleTypes) {
            v.display();
        }
    }

    public static double getMaxCoefficient(VehicleType[] vehicleTypes) {
        double max = -1;

        for (VehicleType v :
                vehicleTypes) {
            if (v.getTaxCoefficient() > max) max = v.getTaxCoefficient();
        }
        return max;
    }

    public static double getAverageCoefficient(VehicleType[] vehicleTypes) {
        double averageCoefficient = 0.0;

        for (VehicleType v :
                vehicleTypes) {
            averageCoefficient += v.getTaxCoefficient() / (vehicleTypes.length - 1);
        }

        return averageCoefficient;
    }
}
