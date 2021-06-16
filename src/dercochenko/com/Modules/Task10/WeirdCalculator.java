package dercochenko.com.Modules.Task10;

public final class WeirdCalculator extends Calculator{
//    public static double getDivision(double i, double j) {
//        return -i / j;
//    }
    public static double getDivision(float i, float j) {
        return -i / j;
    }

    public static int sqrt(int result){
        return (int) -Math.sqrt(result);
    }
}
