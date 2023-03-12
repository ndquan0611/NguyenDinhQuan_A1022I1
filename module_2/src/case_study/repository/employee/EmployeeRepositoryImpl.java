package case_study.repository.employee;

import case_study.model.person.Employee;
import case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void display() {
        employeeList = FileUtils.readEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        FileUtils.writeEmployee(employeeList);
    }


    @Override
    public void edit() {

    }
}
