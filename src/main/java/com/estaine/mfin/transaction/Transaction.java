package com.estaine.mfin.transaction;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaction_header")
@Inheritance(strategy= InheritanceType.JOINED)
public class Transaction {
    @Id
    @GeneratedValue
    @Getter private Integer id;

    @Getter @Setter private Date date;

    @Getter @Setter private String description;
}
