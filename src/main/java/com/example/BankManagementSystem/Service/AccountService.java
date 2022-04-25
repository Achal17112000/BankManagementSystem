package com.example.BankManagementSystem.Service;

import com.example.BankManagementSystem.bean.Account;
import com.example.BankManagementSystem.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {

    @Autowired(required = false)
    AccountRepository accountRepository;

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> getAccounts() {
        List<Account> accountList = new ArrayList<>();
        accountRepository.findAll().forEach(x -> accountList.add(x));
        return accountList;
    }

    public Account getAccountId(long id) {
        return accountRepository.findById(id).get();
    }

    public Account getByAccType(String type) {
        return accountRepository.findByAccType(type);
    }

    public Account updateAcc(Account account) {
        return accountRepository.save(account);
    }

    public void deleteAcc(Account account) {
        accountRepository.delete(account);
    }

    public void deleteByAccNo(long accNo) {
        accountRepository.deleteById(accNo);
    }
}
