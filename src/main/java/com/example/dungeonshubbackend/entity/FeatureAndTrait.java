package com.example.dungeonshubbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class FeatureAndTrait implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String origin;
    private Integer level;
    @Lob
    private String description;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CharacterClass characterClass;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private CharacterRace characterRace;

    @ManyToOne
    @JoinColumn(name = "background_id")
    private CharacterBackground characterBackground;

    private Boolean custom;
    private String author;
}
