package com.example.BankManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue
    int transId;
    double depositAmt;
    double withdrawalAmt;

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public double getDepositAmt() {
        return depositAmt;
    }

    public void setDepositAmt(double depositAmt) {
        this.depositAmt = depositAmt;
    }

    public double getWithdrawalAmt() {
        return withdrawalAmt;
    }

    public void setWithdrawalAmt(double withdrawalAmt) {
        this.withdrawalAmt = withdrawalAmt;
    }
}
