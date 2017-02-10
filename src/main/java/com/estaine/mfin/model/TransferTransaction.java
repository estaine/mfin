package com.estaine.mfin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class TransferTransaction extends TransactionHeader {
    @ManyToOne
    @Getter @Setter private Account fromAccount;

    @ManyToOne
    @Getter @Setter private Account toAccount;

    @Getter @Setter private Double fromAmount;

    @Getter @Setter private Double toAmount;
}
