package com.matheus.agendatelefonica.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	@Column(name = "usuario_id")
	private Integer usuarioId;
	
	@Column(name = "contato_id")
	private Integer contatoId;
	
	public Agenda () {}

	public Agenda(Integer id, Integer usuarioId, Integer contatoId) {
		super();
		this.id = id;
		this.usuarioId = usuarioId;
		this.contatoId = contatoId;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Integer getContatoId() {
		return contatoId;
	}

	public void setContatoId(Integer contatoId) {
		this.contatoId = contatoId;
	}

	public Integer getId() {
		return id;
	}
	
	
}
