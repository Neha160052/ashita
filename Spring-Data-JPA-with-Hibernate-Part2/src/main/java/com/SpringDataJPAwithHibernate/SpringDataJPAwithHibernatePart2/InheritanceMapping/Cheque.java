package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Cheque extends Payment {
    private String chequenumber;

    public String getChequenumber() {
        return chequenumber;
    }

    public void setChequenumber(String chequenumber) {
        this.chequenumber = chequenumber;
    }
}
