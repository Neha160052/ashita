// Question2. Given the following class
// Employee class{ Double Age; Double Salary; String Name}
// Design the class in such a way that the default sorting should work on firstname and lastname.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    double Age;
    double Salary;
    String Name;

    Employee(double Age, double Salary, String Name) {
        this.Age = Age;
        this.Salary = Salary;
        this.Name = Name;
    }

    public String toString() {
        return "Employee [Name=" + Name + ", age=" + Age + ", Salary=" + Salary + "]";
    }

    @Override
    public int compareTo(Employee e) {
        return this.Name.compareTo(String.valueOf(e));
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(21, 20000, "Kratika"));
        list.add(new Employee(22, 10000, "Aman"));
        list.add(new Employee(20, 22000, "Shruti"));

        Collections.sort(list);

       for(Employee employee: list){
           System.out.println(employee);
       }
    }
}
