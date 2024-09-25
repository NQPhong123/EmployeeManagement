package service;

import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    List<Employee> employeeList;

    public EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public void insert(Employee employee) {
        this.employeeList.add(employee);
    }

    public Employee findByID(String ID) {
        return this.employeeList.stream().filter(e -> e.getid().equals(ID)).findFirst().orElse(null);
    }

    public boolean deleteByID(String ID) {
        Employee employee = findByID(ID);
        if (employee == null) {
            return false;
        }
        this.employeeList.remove(employee);
        return true;
    }

    public List<Employee> findByType(int type) {
        return this.employeeList.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employeeList;
    }
}
