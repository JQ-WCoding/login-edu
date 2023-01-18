package com.example.loginsample.service.user;

import com.example.loginsample.domain.User;
import com.example.loginsample.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String singUp(User user) {
        userRepository.save( user );
        return user.getUserId();
    }

    public Optional<User> findMember(String userId, String userPassword) {
        // 실질적인 서비스 구현
        Optional<User> user = userRepository.findById( userId, userPassword );

        return user;
    }
}
