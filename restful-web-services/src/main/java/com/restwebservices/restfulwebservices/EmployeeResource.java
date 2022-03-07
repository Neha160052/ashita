package com.restwebservices.restfulwebservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeDaoService service;

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployee() {
        return service.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee){
        Employee savedEmployee = service.save(employee);
    }
}