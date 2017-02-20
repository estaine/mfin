package com.estaine.mfin.person;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    @Getter private Integer id;

    @Getter @Setter private String firstName;

    @Getter @Setter private String lastName;

    @Getter @Setter private String email;
}
