package com.bips.javaday.springDataJpaBasic.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rafi on 2016-11-19.
 */
@Entity
public class Team {

    @Id
    @SequenceGenerator(name = "team_seq", sequenceName="team_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="team_seq")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Team setName(String name) {
        this.name = name;
        return this;
    }

    public List<Player> getPlayers() {
        if (this.players == null) {
            this.players = new ArrayList<Player>();
        }
        return players;
    }

    public Team addPlayer(Player player) {
        if (this.players == null) {
            this.players = new ArrayList<Player>();
        }

        players.add(player);

        return this;
    }

    public Team setPlayers(List<Player> players) {
        if (this.players != null) {
            this.players.clear();
        }
        this.players = players;
        return this;
    }

    public static Team teamBuilder() {
        return new Team();
    }
}
