package com.Devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
