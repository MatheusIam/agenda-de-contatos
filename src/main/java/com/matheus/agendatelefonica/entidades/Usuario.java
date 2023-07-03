package com.matheus.agendatelefonica.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; // ex. 288
	
	@Column(name = "nome_usuarios")
	private String nomeUsuario; // ex. fulano
	
	@Column(name = "senha")
	private String senha; // ex. senha123
	
//	@OneToOne(mappedBy = "agenda")
//	private Agenda agenda;
	
	public Usuario () {}
	
	public Usuario(Long id, String nomeUsuario, String senha/*, Agenda agenda*/) {
		super();
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
		/*this.agenda = agenda;*/
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

	
	/*public Agenda getAgenda() {
		return agenda;
	}*/

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nomeUsuario=" + nomeUsuario + ", senha=" + senha + "]";
	}
	
}
