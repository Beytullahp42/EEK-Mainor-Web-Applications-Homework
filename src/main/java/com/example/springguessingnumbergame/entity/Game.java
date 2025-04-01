package com.example.springguessingnumbergame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gameId;

    private int number;

    @Setter
    private int attempts = 0;


    @Setter
    private boolean isGameOver = false;

    public Game() {
    }

    public Game(int number) {
        this.number = number;
    }

}
