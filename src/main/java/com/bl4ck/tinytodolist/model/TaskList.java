package com.bl4ck.tinytodolist.model;

import lombok.Data;
import java.util.List;
import javax.persistence.*;


@Data
@Table(name = "TASK_LISTS")
@Entity
public class TaskList{

    @Id @GeneratedValue
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name = "BOARD_ID")
    int boardId;

    //TODO Creo que esta anotacion es para que lo ignore este atributo de momento
    @Transient
    List<Task> tasks;
}
