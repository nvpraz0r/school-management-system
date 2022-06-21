package school.management.system;

/**
 * This class maintains data related to the teacher class
 * -id
 * -name
 * -salary
 */
public class Teacher {
    private int id;
    private String name;
    private double salary;

    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}
