package com.example.loginsample.service.board;

import com.example.loginsample.domain.Board;
import com.example.loginsample.repository.board.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public Optional<Board> findBoardOne(Long boardNo) {
        return boardRepository.findById( boardNo );
    }

    public Optional getAll() {
        return boardRepository.findAll();
    }
}
