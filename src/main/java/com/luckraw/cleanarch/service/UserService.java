package com.luckraw.cleanarch.service;

import com.luckraw.cleanarch.model.User;
import com.luckraw.cleanarch.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
