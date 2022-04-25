package com.example.BankManagementSystem.Controller;

import com.example.BankManagementSystem.Service.AccountService;
import com.example.BankManagementSystem.bean.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/addAccount")
    Account addAcc(@RequestBody Account account) {
       return accountService.addAccount(account);
    }

    @GetMapping("/getAllAccount")
    List<Account> getAllAcc() {
        return accountService.getAccounts();
    }

    @GetMapping("/getAccountByType/{accType}")
    Account getAccountByType(@PathVariable("accType") String accType ) {
        return accountService.getByAccType(accType);
    }

    @GetMapping("/getByAccNo/{accId}")
    Account getByAccNo(@PathVariable("accId") long accId) {
        return accountService.getAccountId(accId);
    }

    @PutMapping("/updateAccount")
    Account updateAccount(@RequestBody Account account) {
        return accountService.updateAcc(account);
    }

    @DeleteMapping("/deleteAccount")
    void deleteAccount(@RequestBody Account account) {
        accountService.deleteAcc(account);
    }

    @DeleteMapping("/deleteAccount/{accNo}")
    void deleteAccById(@PathVariable("accNo") long accNo) {
        accountService.deleteByAccNo(accNo);
    }

}
