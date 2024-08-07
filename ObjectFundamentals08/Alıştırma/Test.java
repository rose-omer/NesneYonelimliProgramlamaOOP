package ObjectFundamentals08.Alıştırma;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Department department = new Department(300, "Muhasebe");
        department.setEmployeeList(new ArrayList<Employee>());

        Employee employee0 = new Employee(340, "Barış Mango", 3400);
        employee0.setDepartment(department);
        department.getEmployeeList().add(employee0);

        Employee employee1 = new Employee(341, "cem karaca ", 2000);
        employee1.setDepartment(department);
        department.getEmployeeList().add(employee1);


        Employee employee2 = new Employee(343, "ömer köse ", 5900);
        employee2.setDepartment(department);
        department.getEmployeeList().add(employee2);

        System.out.println("Bölüm no : " + department.getDepartmentId());

        System.out.println("Bölüm adı : " + department.getDepartmentName());

        for (Employee employee : department.getEmployeeList()) {
            System.out.print(employee.getEmploveeld() + " ");
            System.out.print(employee.getEmployeeName() + " ");
            System.out.print(employee.getMonthlysalary() + " ");
            System.out.println();
        }

    }
}
