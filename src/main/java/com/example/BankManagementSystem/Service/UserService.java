package com.example.BankManagementSystem.Service;
import com.example.BankManagementSystem.bean.Account;
import com.example.BankManagementSystem.bean.User;
import com.example.BankManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public List<User> getAllUser() {
        List<User> li = new ArrayList<>();
        userRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public void deleteAllUser() {
        userRepository.deleteAll();
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }
}
