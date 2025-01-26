package com.Devsuperior.dslist.controllers;

//CONTROLADOR DE REQUISICOES WEB(END POINT DA API)

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Devsuperior.dslist.dto.GameListDTO;
import com.Devsuperior.dslist.dto.GameMinDTO;
import com.Devsuperior.dslist.services.GameListService;
import com.Devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

//REQUISitANDO BUCA DE TODOS JOGOS E RETORNANDO EM LISTA
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
// REQUISITANDO JOGOS DE UMA LISTA ESPECIFICA COM ID 
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}


	
}
