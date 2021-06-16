package dercochenko.com.Modules.Task9;

import java.util.Scanner;

public class School {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double averageAllStudents;

        System.out.println("please enter count of student");
        Student[] students = new Student[scanner.nextInt()];

        for (int i = 0; i < students.length; i++) {
            students[i] = getNewStudent();
        }

        averageAllStudents = getAverage(students);
        System.out.printf("average mark for all students: %.2f \n",averageAllStudents);

        for (Student s :
                students) {
            if (averageAllStudents > s.getAverageMark()) System.out.println(s);
        }

    }

    public static Student getNewStudent() {
        String name, surname;

        double averageMark;

        System.out.println("please enter information about new Student:");

        System.out.println("enter name: ");
        name = scanner.next();

        System.out.println("enter surname:");
        surname = scanner.next();

        System.out.println("enter average mark:");
        averageMark = scanner.nextDouble();

        return new Student(name, surname, averageMark);
    }

    public static double getAverage(Student[] students) {
        double averageMark = 0;

        for (int i = 0; i < Student.getCountStudents(); i++) {
            averageMark += students[i].getAverageMark();
        }
        return averageMark / Student.getCountStudents();
    }
}
