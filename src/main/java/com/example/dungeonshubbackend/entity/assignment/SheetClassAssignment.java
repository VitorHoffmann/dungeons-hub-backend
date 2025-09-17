package com.example.dungeonshubbackend.entity.assignment;

import com.example.dungeonshubbackend.entity.CharacterClass;
import com.example.dungeonshubbackend.entity.CharacterSheet;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class SheetClassAssignment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "character_sheet_id")
    private CharacterSheet characterSheet;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CharacterClass characterClass;

    private Integer level;
}
