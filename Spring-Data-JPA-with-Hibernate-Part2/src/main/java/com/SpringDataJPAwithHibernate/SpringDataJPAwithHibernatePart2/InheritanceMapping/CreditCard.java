package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping;

import org.springframework.context.annotation.Primary;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("cc")
public class CreditCard extends Payment{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
