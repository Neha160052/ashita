package com.SpringDataJPA.SpringDataJPAwithHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

    @Id
    private int id;
    private String name;
    @Column(name ="description")
    private String desc;
    private double price;

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc(String abcd) {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice(int i) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
