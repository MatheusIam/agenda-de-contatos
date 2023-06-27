package com.matheus.agendatelefonica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.agendatelefonica.entidades.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long>{
	
}
