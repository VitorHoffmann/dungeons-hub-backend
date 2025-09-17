package com.example.dungeonshubbackend.entity.assignment;

import com.example.dungeonshubbackend.entity.CharacterSheet;
import com.example.dungeonshubbackend.entity.Spell;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class SheetSpellAssignment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "character_sheet_id")
    private CharacterSheet characterSheet;

    @ManyToOne
    @JoinColumn(name = "spell_id")
    private Spell spell;

    private Boolean prepared;
}
