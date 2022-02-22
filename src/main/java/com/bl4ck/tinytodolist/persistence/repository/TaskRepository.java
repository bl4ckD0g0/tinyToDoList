package com.bl4ck.tinytodolist.persistence.repository;

import java.util.List;

import com.bl4ck.tinytodolist.model.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    Task findBoardById(Integer id);
    List<Task> findAll();
}
