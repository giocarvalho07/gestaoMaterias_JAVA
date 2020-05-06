package com.gestaoSala.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javassist.SerialVersionUID;

@Entity
public class Convidado {
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@NotNull
	private String nomeMateria;
	
	@NotBlank
	@NotNull
	private Integer quantidadeAlunos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public Integer getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(Integer quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	
}
