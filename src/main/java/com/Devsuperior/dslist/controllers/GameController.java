package com.Devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Devsuperior.dslist.entities.Game;
import com.Devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value= "/games")
public class GameController {

	@Autowired
	private GameService gameService;
		
	public List<Game> findAll(){
		List<Game> result = gameService.findAll();
		return result;
	}
	
}
