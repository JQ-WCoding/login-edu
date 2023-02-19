package com.example.loginsample.repository.board;

import com.example.loginsample.domain.Board;

import java.util.Optional;

public interface BoardRepository {
    Board save(Board board);

    Optional findById(Long boardNo);

    Optional findAll();
}
