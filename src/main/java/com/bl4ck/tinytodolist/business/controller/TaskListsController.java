package com.bl4ck.tinytodolist.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.bl4ck.tinytodolist.model.Task;
import com.bl4ck.tinytodolist.persistence.service.TaskService;

@RestController
@RequestMapping({"/API","/api"})
public class TaskListsController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasklists")
    public List<Task> getAll(){
        return taskService.getAll();
    }

}
