// Question2. Given the following class
// Employee class{ Double Age; Double Salary; String Name}
// Design the class in such a way that the default sorting should work on firstname and lastname.
// Also, Write a program to sort Employee objects based on salary using Comparator.

import java.util.*;

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

    static Comparator<Employee> com = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if(o1.Salary>o2.Salary)
                return 1;
            else if(o1.Salary<o2.Salary)
                return -1;
            else
                return 0;
        }
    };

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(21, 22000, "Kratika"));
        list.add(new Employee(22, 10000, "Aman"));
        list.add(new Employee(20, 20000, "Shruti"));

        Collections.sort(list);

       for(Employee employee: list){
           System.out.println(employee);
       }

        System.out.println();

        Collections.sort(list, com);

        for(Employee employee: list){
            System.out.println(employee);
        }

    }
}
