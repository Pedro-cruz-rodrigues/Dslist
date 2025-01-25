package com.Devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game_list")
public class GameList {
//MAPEAMENTO PRA TABELA RELACIONAL ARROBAS NECESSARIOS

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

// INSTANCIAR CONSTRUTOR VAZIO, SEM PARAMETROS

	public GameList() {

	}
// INSTANCIAR GETTERS E SETTTERS PRA MANEJO DE INFORMACOES

	public GameList(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

// INSTANCIAR HASHCODE PRA FAZER COMPARACAO, SOMENTE ID NECESSARIO

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameList other = (GameList) obj;
		return Objects.equals(id, other.id);
	}

}
