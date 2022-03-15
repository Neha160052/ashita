package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaWithHibernatePart3ApplicationTests {

	@Autowired
	AuthorRepository ar;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateAuthor() {
		Book book = new Book();
		book.setBookName("Java");

		Author author = new Author();
		author.setFirstName("Sneha");
		author.setLastName("goel");
		Address address = new Address();
		address.setCity("Austin");
		address.setStreetAddress("springs");
		address.setState("Texas");
		author.setAddress(address);

		book.setAuthor(author);

		ar.save(author);
	}


	@Test
	public void testCreatemtooCustomer() {

		Author author = new Author();
		author.setFirstName("Sneha");
		author.setLastName("goel");
		Address address = new Address();
		address.setCity("Austin");
		address.setStreetAddress("springs");
		address.setState("Texas");
		author.setAddress(address);

		Book b1 = new Book();
		b1.setBookName("book1");

		Book b2 = new Book();
		b2.setBookName("book2");

		author.addBook(b1);
		author.addBook(b2);

		ar.save(author);
	}
}
