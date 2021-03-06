package com.bl4ck.tinytodolist.persistence.service;

import com.bl4ck.tinytodolist.model.Board;
import com.bl4ck.tinytodolist.persistence.repository.BoardRepository;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public Board getById(Integer id) {
        return boardRepository.findBoardById(id);
    }

    public Board getByName(String name) {
        return boardRepository.findBoardByName(name);
    }

    public List<Board> getAll(){
        return boardRepository.findAll();
    }

}
