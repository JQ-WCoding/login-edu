package com.example.loginsample.controller;

import com.example.loginsample.domain.User;
import com.example.loginsample.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Optional;

@Controller
public class UserController {
    private final UserService userService;

    // 생성자 주입
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping ( "api/users/login" )
    public ResponseEntity<?> getMemberById(@RequestParam Map loginInfo) {
        Optional<User> userId = userService.findMember( ( String ) loginInfo.get( "userId" ) );

        return ResponseEntity.ok( userId );
    }


    @PostMapping ( "/api/users/add" )
    public ResponseEntity<?> signUp(@RequestParam Map userInfo) {
        User user = new User();
        user.setUserId( ( String ) userInfo.get( "userId" ) );
        user.setUserPassword( ( String ) userInfo.get( "userPasswrod" ) );

        String result = userService.singUp( user );

        return ResponseEntity.ok( result );
    }
}
