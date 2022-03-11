package com.SpringDataJPA.SpringDataJPAwithHibernate;

import com.SpringDataJPA.SpringDataJPAwithHibernate.employee.Employee;
import com.SpringDataJPA.SpringDataJPAwithHibernate.employee.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class SpringDataJpaWithHibernateApplicationTests {

	@Autowired
	ProductRepository repository;

	@Autowired
	EmployeeRepository er;

	@Test
	void contextLoads() {
	}

	// test cases for product
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

	@Test
	public void testFindByName(){
		List<Product> products = repository.findByName("TV");
		products.forEach(p->System.out.println("price: "+p.getPrice()));
	}

	@Test
	public void testFindByNameAndDesc(){
		List<Product> products = repository.findByNameAndDesc("TV", "from samsung");
		products.forEach(p->System.out.println("price: "+p.getPrice()));
	}

	@Test
	public void testFindByPriceGreaterThan(){
		List<Product> products = repository.findByPriceGreaterThan(20000d);
		products.forEach(p->System.out.println("price: "+p.getPrice()));
	}

	@Test
	public void testFindByDescContains(){
		List<Product> products = repository.findByDescContains("apple");
		products.forEach(p->System.out.println(p.getName()));
	}

	@Test
	public void testFindByPriceBetween(){
		List<Product> products = repository.findByPriceBetween(10000d, 40000d);
		products.forEach(p->System.out.println(p.getName()));
	}

	@Test
	public void testFindByDescLike(){
		List<Product> products = repository.findByDescLike("%LG%");
		products.forEach(p->System.out.println(p.getName()));
	}

	@Test
	public void testFindByIdIn(){
		List<Product> products = repository.findByIdIn(Arrays.asList(1,2,3));
		products.forEach(p->System.out.println(p.getName()));
	}


	// test cases for employee

	@Test
	public void testCreateEmployee(){
		Employee employee = new Employee();
		employee.setName("john");
		er.save(employee);
	}

}
