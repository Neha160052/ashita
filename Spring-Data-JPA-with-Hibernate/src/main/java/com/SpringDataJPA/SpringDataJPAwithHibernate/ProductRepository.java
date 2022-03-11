package com.SpringDataJPA.SpringDataJPAwithHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findByName(String name);

    List<Product> findByNameAndDesc(String name, String desc);

    List<Product> findByPriceGreaterThan(double price);

    List<Product> findByDescContains(String desc);

    List<Product> findByPriceBetween(Double price1, Double price2);

    List<Product> findByDescLike(String desc);

    List<Product> findByIdIn(List<Integer> Ids);
}
