package com.example.loginsample.repository;

import com.example.loginsample.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private final EntityManager em;


    @Override
    public User save(User user) {
        em.persist( user );
        return user;
    }

    @Override
    public Optional findById(String userId, String userPassword) {
        List<User> resultList = em.createQuery( "select u from User u where u.userId = :userid and u.userPassword = :userpassword", User.class )
                .setParameter( "userid", userId )
                .setParameter( "userpassword", userPassword )
                .getResultList();
        return Optional.ofNullable( resultList );
    }
}
