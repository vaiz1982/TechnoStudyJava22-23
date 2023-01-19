package unit11.collections.day42.sortingListByComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList
                = new ArrayList<>();

        employeeList.add(new Employee("John", 33, 120000));
        employeeList.add(new Employee("Kimberly", 24, 90000));
        employeeList.add(new Employee("Kevin", 42, 200000));

        System.out.println("Employee sorted by Name");
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println(employeeList);
        System.out.println("Employee sorted by Name Reversed");
        employeeList.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println(employeeList);

        System.out.println("Employee sorted by Salary");
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println(employeeList);

        System.out.println("Employee sorted by Salary in Reverse Order");
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employeeList);

        System.out.println("Employees by Age");
        employeeList.sort(Comparator.comparing(Employee::getAge));
        System.out.println(employeeList);


    }
}
