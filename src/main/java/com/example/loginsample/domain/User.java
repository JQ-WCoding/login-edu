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

    @Column ( name = "USER_NAME" )
    private String userName;

    @Column ( name = "USER_ID" )
    private String userId;

    @Column ( name = "USER_PASSWORD" )
    private String userPassword;
}
