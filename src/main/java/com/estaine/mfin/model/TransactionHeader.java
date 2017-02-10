package com.estaine.mfin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class TransactionHeader {
    @Id
    @GeneratedValue
    @Getter private Integer id;

    @Getter @Setter private Date date;

    @Getter @Setter private String description;
}
