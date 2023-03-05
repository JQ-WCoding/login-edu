package com.example.loginsample.controller;

import com.example.loginsample.domain.Board;
import com.example.loginsample.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping ( "/api/board" )
public class BoardController {

    private final BoardService boardService;

    @GetMapping ( "/getAll" )
    public ResponseEntity<?> getAllBoard() {
        Optional result = boardService.getAll();

        return ResponseEntity.ok( result );
    }

    @GetMapping ( "/{boardId}" )
    public ResponseEntity<?> getBoardById(@PathVariable Long boardId) {
        Optional<Board> boardOne = boardService.findBoardOne( boardId );

        return ResponseEntity.ok( boardOne );
    }

    @PostMapping ( "/save" )
    public ResponseEntity<?> saveBoard(@RequestParam String title, @RequestParam String content, @RequestParam String userId) {
        Board board = Board.builder()
                .title( title )
                .content( content )
                .insPersonId( userId )
                .build();

        String result = boardService.save( board );

        return ResponseEntity.ok( result );
    }
}
