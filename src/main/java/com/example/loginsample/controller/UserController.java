package com.example.loginsample.controller;

import com.example.loginsample.domain.User;
import com.example.loginsample.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class UserController {
    private final UserService userService;

    // 생성자 주입
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping ( "/api/user/login" )
    public ResponseEntity<?> login(@RequestParam String userId, @RequestParam String userPassword) throws Exception {
        Optional<User> user = userService.findMember( userId, userPassword );

        return ResponseEntity.ok( user );
    }


    @PostMapping ( "/api/user/signUp" )
    public ResponseEntity<?> signUp(@RequestParam String userName, @RequestParam String userId, @RequestParam String userPassword) {
        User user = new User();
        user.setUserId( userId );
        user.setUserName( userName );
        user.setUserPassword( userPassword );

        String result = userService.singUp( user );

        return ResponseEntity.ok( result );
    }
}
