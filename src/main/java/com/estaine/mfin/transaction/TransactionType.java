package com.estaine.mfin.transaction;

public enum TransactionType {
    SIMPLE_TRANSACTION(SimpleTransaction.class),
    TRANSFER_TRANSACTION(TransferTransaction.class),
    LOAN_TRANSACTION(LoanTransaction.class);

    private Class transactionClass;

    TransactionType(Class transactionClass) {
        this.transactionClass = transactionClass;
    }
}
