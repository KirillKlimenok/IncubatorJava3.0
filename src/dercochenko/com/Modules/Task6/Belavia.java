package dercochenko.com.Modules.Task6;

public class Belavia {
    private String flightDestinationName;
    private String numberAircraft;
    private String type;

    {
        flightDestinationName = "";
        numberAircraft = "";
        type = "";
    }

    public Belavia(String flightDestinationName, String numberAircraft, String type) {
        this.flightDestinationName = flightDestinationName;
        this.numberAircraft = numberAircraft;
        this.type = type;
    }

    public String getFlightDestinationName() {
        return flightDestinationName;
    }

    public String getNumberAircraft() {
        return numberAircraft;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return flightDestinationName + " " + numberAircraft;
    }
}
