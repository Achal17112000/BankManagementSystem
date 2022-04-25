package com.example.BankManagementSystem.repository;

import com.example.BankManagementSystem.bean.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {



}
