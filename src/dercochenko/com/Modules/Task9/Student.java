package dercochenko.com.Modules.Task9;

public class Student {
    private static int countStudents;
    private String name, surname;
    private double averageMark;
    private final String numberSchool = "5";

    public Student(String name, String surname, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
        countStudents++;
    }

    public static int getCountStudents() {
        return countStudents;
    }

    @Override
    public String toString() {
        return name + " " +
                surname + '(' +
                "School number: " +
                numberSchool + ", " +
                "average mark: " +
                averageMark + ')';
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
