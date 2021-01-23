package com.viniciussdr.bookstore.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {

	public int id;
	public String nome;
	public String descricao;
}
