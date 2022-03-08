package com.restwebservices.restfulwebservices;

import javax.validation.constraints.Size;

public class Employee {

    private Integer id;

    @Size(min = 2)
    private String name;
    private int age;

    public Employee(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    protected Employee(){}

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