package com.example.dungeonshubbackend.entity.assignment;

import com.example.dungeonshubbackend.entity.CharacterClassArchtype;
import com.example.dungeonshubbackend.entity.CharacterSheet;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Entity
public class SheetArchtypeAssignment implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "character_sheet_id")
    private CharacterSheet characterSheet;

    @ManyToOne
    @JoinColumn(name = "archtype_id")
    private CharacterClassArchtype characterClassArchtype;

}
