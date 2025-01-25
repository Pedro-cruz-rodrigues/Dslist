package com.Devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

//IMPORTAÇÃO DE DADOS PARA UTILIZAR NO REPOSITORIO DE LISTAS