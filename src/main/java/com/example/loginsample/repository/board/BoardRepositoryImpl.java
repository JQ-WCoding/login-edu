package com.example.loginsample.repository.board;

import com.example.loginsample.domain.Board;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepository {

    @PersistenceContext
    private final EntityManager em;

    @Override
    public Board save(Board board) {
        em.persist( board );
        return board;
    }

    @Override
    public Optional<?> findById(Long boardNo) {
        List<Board> resultList = em.createQuery( "select b from Board b where b.boardNo = :boardNo" )
                .setParameter( "boardNo", boardNo )
                .getResultList();

        return Optional.ofNullable( resultList );
    }

    @Override
    public Optional findAll() {
        List resultList = em.createQuery( "select b.boardNo, b.title, b.content, b.insPersonId, b.insDate, b.updDate from Board b" )
                .getResultList();

        return Optional.ofNullable( resultList );
    }

}
