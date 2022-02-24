package com.bl4ck.tinytodolist.model;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Table(name = "BOARDS")
@Entity
public class Board implements Serializable{
    @Id @GeneratedValue
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;


    @OneToMany(mappedBy = "boardId")
    List<TaskList> taskLists;

}
