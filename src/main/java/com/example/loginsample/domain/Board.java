package com.example.loginsample.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table ( name = "BOARD" )
@Getter
@Setter
@AllArgsConstructor
@Builder
@Data
public class Board {
    public Board() {
    }

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    @Column ( name = "BOARD_NO" )
    private Long boardNo;

    private String title;

    private String content;

    @Column ( name = "INS_PERSON_ID" )
    private String insPersonId;

    @Column ( name = "INS_DATE" )
    @CreationTimestamp
    private LocalDateTime insDate;

    @Column ( name = "UPD_DATE" )
    @UpdateTimestamp
    private LocalDateTime updDate;
}
