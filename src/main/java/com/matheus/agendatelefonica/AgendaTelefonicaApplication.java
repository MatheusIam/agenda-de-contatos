package com.matheus.agendatelefonica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.matheus.agendatelefonica.entidades.Usuario;
import com.matheus.agendatelefonica.repositorios.Usuarios;

@SpringBootApplication
public class AgendaTelefonicaApplication {

	
	
	/*
	@Bean
	public CommandLineRunner init(@Autowired UsuariosRepositorio a) {
		return args ->{
			Usuarios usuario = new Usuarios();
			usuario.setNomeUsuario("Matheus");
			usuario.setSenha("matheus123");
			usuario.setAgendaID(null);
			a.cadastrar(usuario);
		};
	}
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(AgendaTelefonicaApplication.class, args);
	}

}
