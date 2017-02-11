package com.estaine.mfin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class LoanTransaction extends Transaction {
    @ManyToOne
    @Getter @Setter private Account account;

    @Getter @Setter private Double amount;

    @ManyToOne
    @Getter @Setter private ThirdParty thirdParty;

    @ManyToOne
    @Getter @Setter private LoanTransaction relatedLoanTransaction;

}
