package com.example.springguessingnumbergame.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("game")
public class GameController {
    private final HashMap<Integer, Integer> game = new HashMap<>();
    private final HashMap<Integer, Integer> attempts = new HashMap<>();

    @GetMapping
    public String startGame() {
        int gameId = game.size();
        game.put(gameId, Math.round((float) Math.random() * 100)
        );
        attempts.put(gameId, 0);
        return "Game started with id: " + gameId;
    }

    @GetMapping("{id}/guess/{number}")
    public String guess(@PathVariable int id, @PathVariable int number) {
        if (!game.containsKey(id)) {
            return "Game not found";
        }
        attempts.put(id, attempts.get(id) + 1);
        if (game.get(id) == number) {
            return "Congratulations! You guessed the number in " + attempts.get(id) + " attempts";
        } else if (game.get(id) < number) {
            return "Try smaller number";
        } else {
            return "Try bigger number";
        }
    }
}
