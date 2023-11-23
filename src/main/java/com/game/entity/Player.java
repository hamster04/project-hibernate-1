package com.game.entity;

import java.util.Date;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@NamedQuery(name = "Player_FindAllPlayers",
        query = "SELECT COUNT(player) FROM Player player")
@Entity
@Table(schema = "rpg", name = "player")
public class Player {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // будет генерить id на основании таблицы
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_seq")
    // задает свою собственную генерацию id на основании @SequenceGenerator
    //@SequenceGenerator(name = "player_seq", sequenceName = "player_sequence", initialValue = 41, allocationSize=1)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, length = 12)
    @Type(type = "")
    private String name;

    @Column(nullable = false, length = 30)
    private String title;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Race race;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Profession profession;

    @Column(nullable = false)
    private Date birthday;

    @Column(nullable = false)
    private Boolean banned;

    @Column(nullable = false)
    private Integer level;

    public Player() {
    }

    public Player(Long id, String name, String title, Race race, Profession profession, Date birthday, Boolean banned, Integer level) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.race = race;
        this.profession = profession;
        this.birthday = birthday;
        this.banned = banned;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}