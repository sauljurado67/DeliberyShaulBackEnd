package com.example.crud.service;

import com.example.crud.model.User;
import com.example.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User clientes) {
        return userRepository.save(clientes);
    }

    public Optional<User> getUser(int id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User clientes) {
        return userRepository.save(clientes);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
