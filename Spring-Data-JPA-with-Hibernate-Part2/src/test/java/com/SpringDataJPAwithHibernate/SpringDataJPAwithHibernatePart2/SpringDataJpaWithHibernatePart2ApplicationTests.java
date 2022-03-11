package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2;

import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.AssociationMapping.Customer;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.AssociationMapping.CustomerRepository;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.AssociationMapping.PhoneNumber;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.ComponentMapping.Address;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.ComponentMapping.Employees;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.ComponentMapping.EmployeesRepository;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping.Cheque;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping.CreditCard;
import com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
class SpringDataJpaWithHibernatePart2ApplicationTests {

	@Autowired
	StudentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testStudentCreate() {
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Daniel");
		student.setScore(88);

		Student student2 = new Student();
		student2.setFirstName("Bill");
		student2.setLastName("Gates");
		student2.setScore(98);

		repository.save(student);
		repository.save(student2);
	}

	@Test
	public void testFindAllStudents() {
		System.out.println(repository.findAllStudents(PageRequest.of(0, 5, Sort.Direction.DESC, "id")));
	}

	@Test
	public void testFindAllStudentsPartial() {
		List<Object[]> partialData = repository.findAllStudentsPartialData();
		for (Object[] objects : partialData) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Test
	public void testFindAllStudentsByFirstName() {
		System.out.println(repository.findAllStudentsByFirstName("Bill"));
	}


	@Test
	public void testFindAllStudentsByScores() {
		System.out.println(repository.findStudentsForGivenScores(80, 90));
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteStudentsByFirstName() {
		repository.deleteStudentsByFirstName("Bill");
	}

	@Test
	public void testFindAllStudentNQ() {
		System.out.println(repository.findAllStudentNQ());
	}

	@Test
	public void testFindByFirstNameNQ() {
		System.out.println(repository.findByFirstNQ("Bill"));
	}


	// payment test cases(inheritance mapping)

	@Autowired
	PaymentRepository pr;

	@Test
	public void createPayment(){
		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");
		pr.save(cc);
	}

	@Test
	public void createChequePayment(){
		Cheque ch = new Cheque();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setChequenumber(String.valueOf(2134567890));
		pr.save(ch);
	}


	// employees test cases(component mapping)

	@Autowired
	EmployeesRepository er;

	@Test
	public void testCreate(){
		Employees employees = new Employees();
		employees.setId(123);
		employees.setName("John");
		Address address = new Address();
		address.setCity("Austin");
		address.setStreetaddress("springs");
		address.setCountry("USA");
		address.setState("Texas");
		address.setZipcode("78750");
		employees.setAddress(address);
		er.save(employees);
	}

	// association mapping

	@Autowired
	CustomerRepository cr;

	@Test
	public void testCreateCustomer(){
		Customer customer = new Customer();
		customer.setName("John");
	//	HashSet<PhoneNumber> numbers = new HashSet<PhoneNumber>();

		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("1234567890");
		ph1.setType("cell");
	//	ph1.setCustomer(customer);
	//	numbers.add(ph1);


		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("0987654321");
		ph2.setType("home");
	//	ph2.setCustomer(customer);
	//	numbers.add(ph2);

	//	customer.setNumbers(numbers);

		customer.addPhoneNumber(ph1);
		customer.addPhoneNumber(ph2);

		cr.save(customer);
	}


}