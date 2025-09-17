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
public class CharacterBackground implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Lob
    private String description;
    private String specializationName;
    private String specialization;

    private String armorProficiency;
    private String weaponProficiency;
    private String toolProficiency;
    private String skillProficiency;

    @Lob
    private String equipment;

    private Boolean custom;
    private String author;
}
