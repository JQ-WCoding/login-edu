package com.example.loginsample.repository;

import com.example.loginsample.domain.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(String id);
}
