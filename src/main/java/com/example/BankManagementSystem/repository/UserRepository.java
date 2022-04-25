package com.example.BankManagementSystem.repository;

import com.example.BankManagementSystem.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String userName);
}
