package com.Devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Devsuperior.dslist.dto.GameDTO;
import com.Devsuperior.dslist.dto.GameMinDTO;
import com.Devsuperior.dslist.entities.Game;
import com.Devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

//CRIACAO DE METODO DE BUSCA POR ID

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);

	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

	// IMPLEMENTAÇÃO DAS REGRAS DE NEGOCIO
	// INSTACIANDO UMA LIST, PEGANDO TODOS OS GAMES DO REPOSITORY E RETORNANDO
	// O RESULTADO JA REQUISITADO TRANSFORMADO NA NOVA LISTA DE INFORMACOES
	// DESEJADAS
}
