package com.viniciussdr.bookstore.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
	
	public int id;
	public String titulo;
	public String nomeAutor;
	public String texto;

}
