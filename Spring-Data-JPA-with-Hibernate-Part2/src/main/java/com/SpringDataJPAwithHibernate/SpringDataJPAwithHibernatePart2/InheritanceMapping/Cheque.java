package com.SpringDataJPAwithHibernate.SpringDataJPAwithHibernatePart2.InheritanceMapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "bankcheque")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("ch")
public class Cheque extends Payment {
    private String chequenumber;

    public String getChequenumber() {
        return chequenumber;
    }

    public void setChequenumber(String chequenumber) {
        this.chequenumber = chequenumber;
    }
}
