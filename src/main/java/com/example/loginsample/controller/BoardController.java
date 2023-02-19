package com.example.loginsample.controller;

import com.example.loginsample.domain.Board;
import com.example.loginsample.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping ( "/api/board" )
public class BoardController {

    private final BoardService boardService;

    @PostMapping ( "/getAll" )
    public ResponseEntity<?> getAllBoard() {
        Optional result = boardService.getAll();

        return ResponseEntity.ok( result );
    }

    @GetMapping ( "/{boardId}" )
    public ResponseEntity<?> getBoardById(@PathVariable Long boardId) {
        Optional<Board> boardOne = boardService.findBoardOne( boardId );

        return ResponseEntity.ok( boardOne );
    }
}
