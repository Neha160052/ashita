package com.restwebservices.restfulwebservices;

import com.fasterxml.jackson.annotation.JsonFilter;
import net.minidev.json.annotate.JsonIgnore;

import javax.validation.constraints.Size;
import java.io.Serializable;

@JsonFilter("bean-filter")
public class Employee implements Serializable {

    private Integer id;

    @Size(min = 2)
    private String name;
    private int age;
   // @JsonIgnore
    private String password;

    public Employee(Integer id, String name, int age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
