package ObjectFundamentals09.Inheritance;

public class Employee extends Person {
    private long employeId;
    private String departmentName;

    public long getEmployeId() {
        return employeId;
    }

    public void setEmployeId(long employeId) {
        this.employeId = employeId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getGreetings() {
        return "merhaba";
    }
}
