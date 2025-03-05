package com.example.springguessingnumbergame.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class GuessingNumberGame {
    private final HashMap<Integer, Integer> game = new HashMap<>();
    private final HashMap<Integer, Integer> attempts = new HashMap<>();

    public String startGame() {
        int gameId = game.size();
        game.put(gameId, Math.round((float) Math.random() * 100));
        attempts.put(gameId, 0);
        return "Game started with id: " + gameId;
    }

    public String guess(int id, int number) {
        if (!game.containsKey(id)) {
            return "Game not found";
        }
        attempts.put(id, attempts.get(id) + 1);
        if (game.get(id) == number) {
            return "Congratulations! You guessed the number in " + attempts.get(id) + " attempts.";
        } else if (game.get(id) < number) {
            return "Try smaller number";
        } else {
            return "Try bigger number";
        }
    }
}
