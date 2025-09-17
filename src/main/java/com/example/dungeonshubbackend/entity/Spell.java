package com.example.dungeonshubbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class Spell implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer level;
    private String school;
    private String castingTime;
    private String range;
    private String components;
    private String duration;
    private Boolean concentration;
    private Boolean ritual;
    @Lob
    private String description;
    @Lob
    private String attHigherLevels;

    private Boolean custom;
    private String author;
}
