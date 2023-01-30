package com.example.loginsample.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table ( name = "ADMIN_USER" )
@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;
    private String userName;

    private String userId;

    private String userPassword;
}
