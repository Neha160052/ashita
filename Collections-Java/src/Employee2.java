// Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value

import java.util.HashMap;

public class Employee2 {
    String name;
    int age;
    String designation;

    Employee2(String name, int age, String designation){
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String toString(){
        return "Employee [Name=" + name + ", Age=" + age + ", Designation=" + designation + "]";
    }

    public static void main(String[] args) {
        HashMap<Employee2,Integer> employeeMap = new HashMap<Employee2,Integer>();

        Employee2 e1 = new Employee2("Riya",20,"JVM Trainee");
        employeeMap.put(e1,20000);

        Employee2 e2 = new Employee2("Rohit",22,"QE Trainee");
        employeeMap.put(e2,10000);

        for (Employee2 eKey: employeeMap.keySet()) {
            String key = eKey.toString();
            String value = employeeMap.get(eKey).toString();
            System.out.println("key: "+key + " value: " + value);
        }

    }
}
