package com.bips.javaday.springDataJpaBasic.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import java.util.Date;

/**
 * Created by Rafi on 2016-11-13.
 */

@Entity
public class Player {

    @Id
    @SequenceGenerator(name = "player_seq", sequenceName="player_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="player_seq")
    private Long id;

    // personal info
    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;
    private Date dateOfBirth;

    // common match info
    private int totalMatches;
    private int totalInnings;

    // batting info
    private String battingStyle;
    private int totalRuns;
    private int highestScore;
    private int hundreds;
    private int fifties;
    private int notOuts;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Player setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Player setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Team getTeam() {
        return team;
    }

    public Player setTeam(Team team) {
        this.team = team;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Player setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public Player setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
        return this;
    }

    public int getTotalInnings() {
        return totalInnings;
    }

    public Player setTotalInnings(int totalInnings) {
        this.totalInnings = totalInnings;
        return this;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public Player setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
        return this;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public Player setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
        return this;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public Player setHighestScore(int highestScore) {
        this.highestScore = highestScore;
        return this;
    }

    public int getHundreds() {
        return hundreds;
    }

    public Player setHundreds(int hundreds) {
        this.hundreds = hundreds;
        return this;
    }

    public int getFifties() {
        return fifties;
    }

    public Player setFifties(int fifties) {
        this.fifties = fifties;
        return this;
    }

    public int getNotOuts() {
        return notOuts;
    }

    public Player setNotOuts(int notOuts) {
        this.notOuts = notOuts;
        return this;
    }

    public static Player playerBuilder() {
        return new Player();
    }
}
