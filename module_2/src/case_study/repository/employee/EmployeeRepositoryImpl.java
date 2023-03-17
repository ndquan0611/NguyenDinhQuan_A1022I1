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
        FileUtils.writeEmployee(employee);
    }

    @Override
    public void edit(String code, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if ((employeeList.get(i).getCode().equals(code))) {
                employeeList.set(i, employee);
            }
        }
        FileUtils.writeEmployee(employee);
    }
}
