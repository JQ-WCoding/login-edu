package com.example.loginsample.service.login;

import com.example.loginsample.data.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    private final UserDTO userDTO;

    // 생성자 주입
    public LoginServiceImpl(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    @Override
    public ResponseEntity<?> login(Map loginInfo) {

        return null;
    }
}
