package com.bl4ck.tinytodolist.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Data
@Table(name = "TASK_LISTS")
@Entity
public class TaskList implements Serializable{

    @Id @GeneratedValue
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name = "BOARD_ID")
    int boardId;

    @OneToMany(mappedBy = "taskListId" )
    List<Task> tasks;
}
