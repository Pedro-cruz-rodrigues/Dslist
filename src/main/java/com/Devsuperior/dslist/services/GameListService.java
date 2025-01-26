package com.Devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Devsuperior.dslist.dto.GameListDTO;
import com.Devsuperior.dslist.entities.GameList;
import com.Devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

//CRIACAO DE METODO DE BUSCAR TODAS LISTAS DE JOGOS, SEPARANDO-AS

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}

	// IMPLEMENTAÇÃO DAS REGRAS DE NEGOCIO
	// INSTACIANDO UMA LIST, PEGANDO TODOS OS GAMES DO REPOSITORY E RETORNANDO
	// O RESULTADO JA REQUISITADO TRANSFORMADO NA NOVA LISTA DE INFORMACOES
	// DESEJADAS
}
