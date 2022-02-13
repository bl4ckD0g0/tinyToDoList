package com.bl4ck.tinytodolist.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.bl4ck.tinytodolist.model.Board;
import com.bl4ck.tinytodolist.persistence.service.BoardService;

@RestController
public class BoardController {

    @Autowired
    BoardService BoardService;

    @GetMapping("/boards")
    public List<Board> getAll(){
        return BoardService.getAll();
    }

}
