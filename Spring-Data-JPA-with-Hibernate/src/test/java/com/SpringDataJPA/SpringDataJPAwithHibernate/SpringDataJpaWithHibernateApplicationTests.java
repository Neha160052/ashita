package com.SpringDataJPA.SpringDataJPAwithHibernate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class SpringDataJpaWithHibernateApplicationTests {

	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("abcd");
		product.setPrice(70000);
		repository.save(product);
	}

	@Test
	public void testRead(){
		 Product product = repository.findById(1).get();
		 assertNotNull(product);
		 assertEquals("Iphone",product.getName());

	}

	@Test
	public void testUpdate(){
		Product product = repository.findById(1).get();
		product.setPrice(80000);
		repository.save(product);
	}

	@Test
	public void testDelete(){
		repository.existsById(1);
		repository.deleteById(1);
	}

	@Test
	public void testCount(){
		System.out.println("Total count: "+repository.count());
	}


}
