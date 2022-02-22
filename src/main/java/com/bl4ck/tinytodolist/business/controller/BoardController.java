package com.bl4ck.tinytodolist.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 2031b08a3d8f485aedfdf44ea2323030c13e9b0c
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.bl4ck.tinytodolist.model.Board;
import com.bl4ck.tinytodolist.persistence.service.BoardService;

@RestController
@RequestMapping({"/API","/api"})
public class BoardController {

    @Autowired
    BoardService BoardService;

    @GetMapping("/boards")
    public List<Board> getAll(){
        return BoardService.getAll();
    }

    @GetMapping("/board/{name}")
    public Board getOne(@PathVariable String name){
        return BoardService.getByName(name);
    }
    
}
