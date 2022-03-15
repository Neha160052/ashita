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
}
