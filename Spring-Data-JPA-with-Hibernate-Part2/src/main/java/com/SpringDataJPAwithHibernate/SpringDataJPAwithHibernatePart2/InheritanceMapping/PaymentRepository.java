package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
