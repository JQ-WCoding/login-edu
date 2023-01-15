package com.example.loginsample.service.user;

import com.example.loginsample.domain.User;
import com.example.loginsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String singUp(User user) {

        userRepository.save( user );
        return "";
    }
}
