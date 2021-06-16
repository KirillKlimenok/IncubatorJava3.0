package dercochenko.com.Modules.Task15;

public class InkjetPrinter extends Printer{
    public InkjetPrinter(String typePrinters, boolean hasScanner) {
        super(typePrinters, hasScanner);
    }

    @Override
    public void print() {
        System.out.println("Let's print text with color.");
        super.print();
    }
}
