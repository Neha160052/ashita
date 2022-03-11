package com.SpringDataJPA.SpringDataJPAwithHibernate.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
