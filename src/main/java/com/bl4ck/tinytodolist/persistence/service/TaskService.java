package com.bl4ck.tinytodolist.persistence.service;

import java.util.List;

import com.bl4ck.tinytodolist.model.Task;
import com.bl4ck.tinytodolist.persistence.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public Task getBoard(Integer id) {
        return taskRepository.findBoardById(id);
    }

    public List<Task> getAll(){
        return taskRepository.findAll();
    }
}
