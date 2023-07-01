package com.matheus.agendatelefonica.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id; // ex. 288
	
	@Column(name = "nome_usuarios")
	private String nomeUsuario; // ex. fulano
	
	@Column(name = "senha")
	private String senha; // ex. senha123
	
	@OneToMany(mappedBy = "usuario")
	private Set<Agenda> agendass; // ex. 32
	
	public Usuario () {}
	
	public Usuario(Integer id, String nomeUsuario, String senha, Set<Agenda> agendass) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		this.agenda = agenda;
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

	public Set<Agenda> getAgenda() {
		return agenda;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + "]";
	}
	
}
