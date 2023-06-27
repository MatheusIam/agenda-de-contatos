package com.matheus.agendatelefonica.entidades;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeUsuario;
	private String senha;
	
	@OneToMany
	private Integer agendaID;
	
	public Usuario () {}
	
	public Usuario(Integer id, String nomeUsuario, String senha, Contato contatos, Integer agendaID) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.agendaID = agendaID;
//		this.contatos = contatos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getAgendaID() {
		return agendaID;
	}

	public void setAgendaID(Integer agendaID) {
		this.agendaID = agendaID;
	}
}
