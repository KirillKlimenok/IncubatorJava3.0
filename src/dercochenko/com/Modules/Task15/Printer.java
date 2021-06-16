package dercochenko.com.Modules.Task15;

public abstract class Printer {
    private final String typePrinters;
    private boolean hasScanner;

    public Printer(String typePrinters, boolean hasScanner) {
        this.typePrinters = typePrinters;
        this.hasScanner = hasScanner;
    }

    public void print() {
        if (hasScanner) {
            System.out.println("the scan is complete");
        } else {
            System.out.println("the scan is impossible");
        }
    }

}
