package com.example.springguessingnumbergame.services;

import com.example.springguessingnumbergame.entity.Game;
import com.example.springguessingnumbergame.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GuessingNumberGame {

    private final GameRepository gameRepository;

    public String startGame() {
        Game game = new Game((int) (Math.random() * 100));
        gameRepository.save(game);
        return "Game started with id: " + game.getGameId() + "\n To make a guess, send a GET request to /game/" + game.getGameId() + "/guess/{number}";
    }
    public String guess(int id, int number) {
        Optional<Game> optionalGame = gameRepository.findById(id);
        if (optionalGame.isEmpty()) {
            return "Game not found.";
        }
        Game game = optionalGame.get();
        if (game.isGameOver()) {
            return "Game is already over. Attempts: " + game.getAttempts();
        }

        game.setAttempts(game.getAttempts() + 1);

        if (game.getNumber() == number) {
            game.setGameOver(true);
            gameRepository.save(game);
            return "Congratulations! You guessed the number in " + game.getAttempts() + " attempts.";
        } else if (game.getNumber() < number) {
            gameRepository.save(game);
            return "Try smaller number";
        } else {
            gameRepository.save(game);
            return "Try bigger number";
        }
    }
}
