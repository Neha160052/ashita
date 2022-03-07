package com.restwebservices.restfulwebservices;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDaoService {
    private static List<Employee> employees = new ArrayList<>();

    private static int employeecount = 3;

    static {
        employees.add(new Employee(1,"Adam", 20));
        employees.add(new Employee(2,"Eve", 21));
        employees.add(new Employee(3,"Jack", 22));
    }

    public List<Employee> findAll(){
        return employees;
    }

    public Employee save(Employee employee){
        if(employee.getId() == null){
            employee.setId(++employeecount);
        }
        employees.add(employee);
        return employee;
    }

    public Employee findOne(int id){
        for (Employee e: employees){
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }

}

