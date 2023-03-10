package com.example.loginsample.repository.user;

import com.example.loginsample.domain.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional findById(String userId, String userPassword);
}
