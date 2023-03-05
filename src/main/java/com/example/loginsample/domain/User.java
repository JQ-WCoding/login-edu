package com.example.loginsample.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table ( name = "USER" )
@Getter
@Setter
@AllArgsConstructor
@Builder
@Data
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
