package com.example.springguessingnumbergame.api;

import com.example.springguessingnumbergame.services.GuessingNumberGame;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("game")
public class GameController {

    private final GuessingNumberGame game;

    @GetMapping
    public String startGame() {
        return game.startGame();
    }

    @GetMapping("{id}/guess/{number}")
    public String guess(@PathVariable int id, @PathVariable int number) {
        return game.guess(id, number);
    }
}