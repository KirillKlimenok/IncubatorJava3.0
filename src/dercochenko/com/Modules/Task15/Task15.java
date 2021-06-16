package dercochenko.com.Modules.Task15;

public class Task15 {
    public static void main(String[] args){
    Printer samsung = new LaserPrinter("Samsung", true);
    Printer canon = new InkjetPrinter("Canon", false);

    samsung.print();
    canon.print();
    }
}
