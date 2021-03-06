package school.management.system.Model;

import school.management.system.Controller.School;
import school.management.system.Controller.Student;
import school.management.system.Controller.Teacher;

import java.util.ArrayList;
import java.util.List;

public class GenerateData {
    public static void generateData() {
        List<Teacher> teacherList = new ArrayList<>();

        Teacher A = new Teacher(1, "Amanda", 500.00);
        Teacher B = new Teacher(2, "Brenda", 600.00);
        Teacher C = new Teacher(3, "Clarissa", 700.00);
        Teacher D = new Teacher(4, "David", 800.00);

        teacherList.add(A);
        teacherList.add(B);
        teacherList.add(C);
        teacherList.add(D);

        List<Student> studentList = new ArrayList<>();

        Student E = new Student(1, "Eric", 80.12);
        Student F = new Student(2, "Frank", 80.11);
        Student G = new Student(3, "Georgia", 90.10);
        Student H = new Student(4, "Henrietta", 94.12);

        studentList.add(E);
        studentList.add(F);
        studentList.add(G);
        studentList.add(H);

        School JLS = new School(teacherList, studentList);
    }
}
