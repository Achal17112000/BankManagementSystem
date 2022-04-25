package com.example.BankManagementSystem.Service;

import com.example.BankManagementSystem.bean.Account;
import com.example.BankManagementSystem.bean.Transaction;
import com.example.BankManagementSystem.bean.TransactionException;
import com.example.BankManagementSystem.repository.AccountRepository;
import com.example.BankManagementSystem.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    AccountRepository accountRepository;

    public double CheckBalance(long accNo) {
        Account acc = accountRepository.findById(accNo).get();
        double bal = acc.getBalance();
        return bal;
    }

    public double withdraw(long AccNo, double amt) throws TransactionException{
        Account acc = accountRepository.findById(AccNo).get();
        double bal = acc.getBalance();
        if(amt > bal) {
            throw new TransactionException("Insufficient Balance...");
        }
        else {
            bal = bal - amt;
            Transaction t = new Transaction();
            t.setBalance(bal);
            t.getTransDate().getTime();
            transactionRepository.save(t);
            return bal;
        }
    }

    public double deposit(long Accno, double amt) throws TransactionException {
        if( amt == 0) {
            throw new TransactionException("Please enter valid amount");
        }
        else {
            Account acc = accountRepository.findById(Accno).get();
            double bal = acc.getBalance();
            bal = bal + amt;
            return bal;
        }
    }

}
