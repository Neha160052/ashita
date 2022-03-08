package com.restwebservices.restfulwebservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.net.URI;
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
    public EntityModel<Employee> retrieveEmployee(@PathVariable int id){
        Employee employee = service.findOne(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id-"+id);

        EntityModel<Employee> resource = EntityModel.of(employee);

        WebMvcLinkBuilder linkTo =
                linkTo(methodOn(this.getClass()).retrieveAllEmployee());
        resource.add(linkTo.withRel("all-employees"));
        return resource;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee){
        Employee savedEmployee = service.save(employee);

       URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        Employee employee = service.deleteById(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id-"+id);
        //return employee;
    }
}