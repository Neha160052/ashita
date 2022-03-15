package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart3;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Embedded
    private Address address;

    List<String> subject = new ArrayList<>();

    /*@OneToOne(mappedBy = "author")
    private Book book;*/

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private Set<Book> books;

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Book> getNumbers() {
        return books;
    }

    public void setNumbers(Set<Book> numbers) {
        this.books = numbers;
    }

    public void addBook(Book book) {
        if (book != null) {
            if (books == null) {
                books = new HashSet<>();
            }
            book.setAuthor(this);
            books.add(book);
        }
    }
}
