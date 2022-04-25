package com.example.BankManagementSystem.repository;

import com.example.BankManagementSystem.bean.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
    Account findByAccType(String AccType);

}
