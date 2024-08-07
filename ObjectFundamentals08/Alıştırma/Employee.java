package ObjectFundamentals08.Alıştırma;

public class Employee {

    private long emploveeld;
    private String employeeName;
    private double monthlysalary;
    private  Department department;

    public Employee(long emploveeld, String employeeName, double monthlysalary) {
        this.emploveeld = emploveeld;
        this.employeeName = employeeName;
        this.monthlysalary = monthlysalary;
    }

    public Employee() {
    }


    public long getEmploveeld() {
        return emploveeld;
    }

    public void setEmploveeld(long emploveeld) {
        this.emploveeld = emploveeld;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMonthlysalary() {
        return monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
