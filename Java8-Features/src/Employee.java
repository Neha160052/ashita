// WAP using java 8:
//Given a list of objects of following class:
//           class Employee{
//           String fullName;
//           Long salary;
//           String city;
//           }
//
//          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//          Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    String fullName;
    Long salary;
    String city;


    public Employee(String fullName, Long salary, String city)
    {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String toString()
    {
        return "Name : "+ fullName
                +", Salary : "+ salary
                +", City: "+ city;
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Nitin Joshi", 11000L, "Delhi"));
        list.add(new Employee("Sakshi Singh", 2000L, "Noida"));
        list.add(new Employee("Nitin Joshi", 13000L, "Delhi"));
        list.add(new Employee("Jiya Brein", 30000L, "Delhi"));
        list.add(new Employee("Nisha Gupta", 4100L, "Bangalore"));


        System.out.println(
                list.stream()
                        .distinct()
                        .filter(a -> a.salary > 5000 )
                        .filter(a -> a.city.startsWith("Delhi"))
                        .collect(Collectors.toList())
        );


    }
}
