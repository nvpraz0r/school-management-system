package school.management.system.Controller;

/**
 *
 * This class maintains data related to students
 *  -id
 *  -name
 *  -grade (GPA too)
 *  -fees (paid)
 *
 */

public class Student {

    private int id;
    private String name;
    private double grade;
    private double feesPaid;
    private double feesTotal;

    /**
     *
     * @param id unique identifier for the student
     * @param name name of the student
     * @param grade grade received by the student
     */
    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        // initial payment values
        feesPaid = 0.00;
        feesTotal = 3000.00;
    }

    /**
     *
     * @param fees tuition that the student has paid thus far
     */
    public void updateFeesPaid(double fees){
        feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }
}
