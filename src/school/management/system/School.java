package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private double totalMoneyEarned;
    private double totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(double totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(double totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
