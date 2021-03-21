package com.gqlzu.dao.entity;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @Column(name = "roleId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "characterName")
    private String characterName;
}
