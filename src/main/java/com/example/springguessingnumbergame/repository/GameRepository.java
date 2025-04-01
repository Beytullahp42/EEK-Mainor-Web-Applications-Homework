package com.example.springguessingnumbergame.repository;

import com.example.springguessingnumbergame.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {

}
