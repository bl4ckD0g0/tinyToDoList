package com.bl4ck.tinytodolist.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table (name = "TASKS")
@Entity
public class Task implements Serializable{

    @Id @GeneratedValue
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;

    @Column
    int taskListId; 
}
