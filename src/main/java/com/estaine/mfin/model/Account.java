package com.estaine.mfin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue
    @Getter private Integer id;

    @Getter @Setter private String accountName;

    @ManyToOne
    @Getter @Setter private Currency currency;

    @ManyToOne
    @Getter @Setter private Person person;
}
