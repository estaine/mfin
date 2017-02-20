package com.estaine.mfin.transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    @Getter private Integer id;

    @Getter @Setter private String name;
}
