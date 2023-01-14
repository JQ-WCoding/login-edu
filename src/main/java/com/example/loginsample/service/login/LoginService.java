package com.example.loginsample.service.login;

import com.example.loginsample.data.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface LoginService {
    public ResponseEntity<?> login(Map loginInfo);
}

