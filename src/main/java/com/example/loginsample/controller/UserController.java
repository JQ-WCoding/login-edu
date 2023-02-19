package com.example.loginsample.controller;

import com.example.loginsample.domain.User;
import com.example.loginsample.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping ( "/api/user" )
public class UserController {
    private final UserService userService;

    @PostMapping ( "/login" )
    public ResponseEntity<?> login(@RequestParam String userId, @RequestParam String userPassword) throws Exception {
        Optional<User> user = userService.findMember( userId, userPassword );

        return ResponseEntity.ok( user );
    }


    @PostMapping ( "/signUp" )
    public ResponseEntity<?> signUp(@RequestParam String userName, @RequestParam String userId, @RequestParam String userPassword) {
        User user = User.builder()
                .userId( userId )
                .userName( userName )
                .userPassword( userPassword )
                .build();

        String result = userService.singUp( user );

        return ResponseEntity.ok( result );
    }
}

