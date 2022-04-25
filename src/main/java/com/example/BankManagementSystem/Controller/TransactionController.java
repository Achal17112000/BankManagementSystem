package com.example.BankManagementSystem.Controller;

import com.example.BankManagementSystem.Service.TransactionService;
import com.example.BankManagementSystem.bean.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/cashDeposit")
    double cashdeposit(@RequestBody long accno, double amt) {
        double bal=0;
        try {
            bal = transactionService.deposit(accno, amt);
        }catch (TransactionException t) {
            t.printStackTrace();
        }
        return bal;
    }

    @PostMapping("/withdrawCash")
    double withdrawCash(@RequestBody long accno, double amt) {
        double bal = 0;
        try {
            bal = transactionService.withdraw(accno, amt);
        }catch (TransactionException t) {
            t.printStackTrace();
        }
        return bal;
    }

    @PostMapping("/checkBalance")
    double checkBal(@RequestBody long accNo) {
        return transactionService.CheckBalance(accNo);
    }
}
