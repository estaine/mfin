package com.estaine.mfin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class TransferTransaction extends Transaction {
    @ManyToOne
    @Getter @Setter private Account fromAccount;

    @ManyToOne
    @Getter @Setter private Account toAccount;

    @Getter @Setter private Double fromAmount;

    @Getter @Setter private Double toAmount;
}
