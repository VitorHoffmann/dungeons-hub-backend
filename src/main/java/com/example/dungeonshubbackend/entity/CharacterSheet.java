package com.example.dungeonshubbackend.entity;

import com.example.dungeonshubbackend.entity.assignment.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@Setter
@Getter
@Entity
public class CharacterSheet implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String playerName;
    private Integer level;
    private Integer xp;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetClassAssignment> characterClasses;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetArchtypeAssignment> characterClassArchtypes;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private CharacterRace characterRace;

    @ManyToOne
    @JoinColumn(name = "subrace_id")
    private CharacterSubrace characterSubrace;

    private Boolean inspiration;

    private Integer armorClass;
    private Integer totalHp;
    private Integer currentHp;
    private Integer temporaryHp;
    private Integer initiative;
    private String speed;
    private Integer proficiencyBonus;
    private Integer totalHitDice;
    private String hitDice;

    private Integer deathSaveSuccess;
    private Integer deathSaveFailure;

    private String alignment;
    @Lob
    private String personalityTraits;
    @Lob
    private String ideal;
    @Lob
    private String bond;
    @Lob
    private String flaw;

    private Integer strength;
    private Integer strengthBonus;
    private Integer strengthSavingThrow;
    private Boolean strengthSavingThrowProficient;
    private Integer dexterity;
    private Integer dexterityBonus;
    private Integer dexteritySavingThrow;
    private Boolean dexteritySavingThrowProficient;
    private Integer constitution;
    private Integer constitutionBonus;
    private Integer constitutionSavingThrow;
    private Boolean constitutionSavingThrowProficient;
    private Integer intelligence;
    private Integer intelligenceBonus;
    private Integer intelligenceSavingThrow;
    private Boolean intelligenceSavingThrowProficient;
    private Integer wisdom;
    private Integer wisdomBonus;
    private Integer wisdomSavingThrow;
    private Boolean wisdomSavingThrowProficient;
    private Integer charisma;
    private Integer charismaBonus;
    private Integer charismaSavingThrow;
    private Boolean charismaSavingThrowProficient;

    private Integer acrobaticsBonus;
    private Boolean acrobaticsProficient;
    private Boolean acrobaticsExpertise;
    private Integer animalHandlingBonus;
    private Boolean animalHandlingProficient;
    private Boolean animalHandlingExpertise;
    private Integer arcanaBonus;
    private Boolean arcanaProficient;
    private Boolean arcanaExpertise;
    private Integer athleticsBonus;
    private Boolean athleticsProficient;
    private Boolean athleticsExpertise;
    private Integer deceptionBonus;
    private Boolean deceptionProficient;
    private Boolean deceptionExpertise;
    private Integer historyBonus;
    private Boolean historyProficient;
    private Boolean historyExpertise;
    private Integer insightBonus;
    private Boolean insightProficient;
    private Boolean insightExpertise;
    private Integer intimidationBonus;
    private Boolean intimidationProficient;
    private Boolean intimidationExpertise;
    private Integer investigationBonus;
    private Boolean investigationProficient;
    private Boolean investigationExpertise;
    private Integer medicineBonus;
    private Boolean medicineProficient;
    private Boolean medicineExpertise;
    private Integer natureBonus;
    private Boolean natureProficient;
    private Boolean natureExpertise;
    private Integer perceptionBonus;
    private Boolean perceptionProficient;
    private Boolean perceptionExpertise;
    private Integer performanceBonus;
    private Boolean performanceProficient;
    private Boolean performanceExpertise;
    private Integer persuasionBonus;
    private Boolean persuasionProficient;
    private Boolean persuasionExpertise;
    private Integer religionBonus;
    private Boolean religionProficient;
    private Boolean religionExpertise;
    private Integer sleighOfHandsBonus;
    private Boolean sleighOfHandsProficient;
    private Boolean sleighOfHandsExpertise;
    private Integer stealthBonus;
    private Boolean stealthProficient;
    private Boolean stealthExpertise;
    private Integer survivalBonus;
    private Boolean survivalProficient;
    private Boolean survivalExpertise;

    private Integer passiveWisdom;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetAttackAssignment> characterAttacksAndSpellcasting;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetFeatureAssignment> characterFeaturesAndTraits;

    private Integer cp;
    private Integer sp;
    private Integer ep;
    private Integer gp;
    private Integer pp;

    private Integer age;
    private Integer height;
    private Integer weight;
    private String eyes;
    private String skin;
    private String hair;

    //todo - character appearance (image)

    //todo - symbol (name and image)

    @Lob
    private String alliesAndOrganizations;
    @Lob
    private String additionalFeaturesAndTraits;
    @Lob
    private String treasure;
    @Lob
    private String backstory;

    private String spellcastingClass;
    private String spellcastingAbility;
    private Integer spellSaveDC;
    private Integer spellAttackBonus;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterCantrips;

    private Integer spellLvl1SlotsTotal;
    private Integer spellLvl1SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl1Spells;

    private Integer spellLvl2SlotsTotal;
    private Integer spellLvl2SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl2Spells;

    private Integer spellLvl3SlotsTotal;
    private Integer spellLvl3SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl3Spells;

    private Integer spellLvl4SlotsTotal;
    private Integer spellLvl4SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl4Spells;

    private Integer spellLvl5SlotsTotal;
    private Integer spellLvl5SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl5Spells;

    private Integer spellLvl6SlotsTotal;
    private Integer spellLvl6SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl6Spells;

    private Integer spellLvl7SlotsTotal;
    private Integer spellLvl7SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl7Spells;

    private Integer spellLvl8SlotsTotal;
    private Integer spellLvl8SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl8Spells;

    private Integer spellLvl9SlotsTotal;
    private Integer spellLvl9SlotsExpended;

    @OneToMany(mappedBy = "characterSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SheetSpellAssignment> characterLvl9Spells;

}
