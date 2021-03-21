package com.gqlzu.dao.entity;

import javax.persistence.*;

@Entity
public class Actor {

    @Id
    @Column(name = "actorId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "actorName", nullable = false)
    private String actorName;


}
