package com.example.loginsample.repository;

import com.example.loginsample.domain.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final EntityManager entityManager;


    @Override
    public User save(User user) {
        entityManager.persist( user );
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        User user = entityManager.find( User.class, id );
        return Optional.ofNullable( user );
    }
}
