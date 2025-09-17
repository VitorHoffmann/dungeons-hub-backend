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
public class CharacterSubrace implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Lob
    private String description;

    private Integer strengthBonus;
    private Integer dexterityBonus;
    private Integer constitutionBonus;
    private Integer intelligenceBonus;
    private Integer wisdomBonus;
    private Integer charismaBonus;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private CharacterRace characterRace;

    private String armorProficiency;
    private String weaponProficiency;
    private String toolProficiency;

    private Boolean custom;
    private String author;
}