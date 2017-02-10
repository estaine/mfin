package com.estaine.mfin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionHeader {
    @Id
    @GeneratedValue
    @Getter @Setter private Integer id;


}
