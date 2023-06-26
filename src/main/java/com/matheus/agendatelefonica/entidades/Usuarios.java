package com.matheus.agendatelefonica.entidades;

public class Usuarios {
//	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeUsuario;
	private String senha;
	private Integer agendaID;
	//private Contatos contatos;
	
	public Usuarios () {}
	
	public Usuarios(Integer id, String nomeUsuario, String senha, Contatos contatos, Integer agendaID) {
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
