package com.matheus.agendatelefonica.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.matheus.agendatelefonica.entidades.Usuarios;

@Repository
public class UsuariosRepositorio {

	private static String INSERT = "insert into tb_usuarios (nome_usuario, senha, agenda_id) values (?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Usuarios cadastrar(Usuarios usuario) {
		jdbcTemplate.update(INSERT, new Object[] {
				usuario.getNomeUsuario(),
				usuario.getSenha(),
				usuario.getAgendaID()
		});
		return usuario;
	}
	
}
