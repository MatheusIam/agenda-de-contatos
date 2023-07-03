package com.matheus.agendatelefonica.entidades;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	@Column(name = "usuario_id")
	private Integer usuarioId;
	
	
	@OneToMany(mappedBy = "id.contatos")
	private Set<Contato> contatos;
	
	public Agenda () {}

	public Agenda(Integer id, Integer usuarioId) {
		super();
		this.id = id;
		this.usuarioId = usuarioId;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Set<Contato> getContato() {
		return contatos;
	}

	public Integer getId() {
		return id;
	}
	
	
}
