package com.estaine.mfin.transaction;

import com.estaine.mfin.person.Person;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ThirdParty {
    @Id
    @GeneratedValue
    @Getter private Integer id;

    @Getter @Setter private String name;

    @ManyToOne
    @Getter @Setter private Person person;
}
