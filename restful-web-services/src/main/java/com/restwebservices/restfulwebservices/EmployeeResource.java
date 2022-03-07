package com.restwebservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeResource {

    private EmployeeDaoService service;

    @GetMapping("/employees")
    public List<EmployeeDaoService> retrieveAllEmployee(){
        return service.findAll();
    }
}
