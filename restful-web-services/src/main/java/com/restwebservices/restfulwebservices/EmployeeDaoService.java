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

    public static class Employee {

        private Integer id;
        private String name;
        private int age;

        public Employee(Integer id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
