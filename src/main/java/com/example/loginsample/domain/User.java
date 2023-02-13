package com.example.loginsample.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table ( name = "ADMIN_USER" )
@Getter
@Setter
@AllArgsConstructor
@Builder
public class User {
    public User() {
    }
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;
    private String userName;

    private String userId;

    private String userPassword;
}
