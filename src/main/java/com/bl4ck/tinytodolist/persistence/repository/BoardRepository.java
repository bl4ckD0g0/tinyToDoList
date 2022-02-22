package com.bl4ck.tinytodolist.persistence.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.bl4ck.tinytodolist.model.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    Board findBoardById(Integer id);
    Board findBoardByName(String name);
    List<Board> findAll();
}
