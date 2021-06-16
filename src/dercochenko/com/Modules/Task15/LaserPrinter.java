package dercochenko.com.Modules.Task15;

public class LaserPrinter extends Printer{
    public LaserPrinter(String typePrinters, boolean hasScanner) {
        super(typePrinters, hasScanner);
    }

    @Override
    public void print() {
        System.out.println("Let's print this text");
        super.print();
    }
}
