package com.example.loginsample.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table ( name = "BOARD" )
@Getter
@Setter
@AllArgsConstructor
@Builder
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
    private String insDate;

    @Column ( name = "UPD_DATE" )
    private String updDate;
}
