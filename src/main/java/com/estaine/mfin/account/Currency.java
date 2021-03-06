package com.estaine.mfin.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Currency {
    @Id
    @GeneratedValue
    @Getter private String id;

    @Getter @Setter private String isoCode;
}
