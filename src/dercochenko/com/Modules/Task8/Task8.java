package dercochenko.com.Modules.Task8;

public class Task8 {
    public static void main(String[] args) {
        Vector vector1 = new Vector('M', 1, 2, 3);
        Vector vector2 = new Vector('B', 1, 4, 3);
        Vector vector3 = new Vector('C', 4, 1, 3);
        Vector vector4 = new Vector('D', 1, 3, 2);

        System.out.println("Check them for equality using equals");
        System.out.println(vector1 + ".equals(" + vector2 + ")\n" + vector1.equals(vector2));
        System.out.println(vector1 + ".equals(" + vector3 + ")\n" + vector1.equals(vector3));
        System.out.println(vector1 + ".equals(" + vector4 + ")\n" + vector1.equals(vector4));
        System.out.println(vector2 + ".equals(" + vector3 + ")\n" + vector2.equals(vector3));

        System.out.println("Check them for equality using '=='");
        System.out.println(vector1 + "==" + vector2 + "\n" + (vector1 == vector2));
        System.out.println(vector1 + "==" + vector3 + "\n" + (vector1 == vector3));
        System.out.println(vector1 + "==" + vector4 + "\n" + (vector1 == vector4));
        System.out.println(vector2 + "==" + vector3 + "\n" + (vector2 == vector3));

    }
}

