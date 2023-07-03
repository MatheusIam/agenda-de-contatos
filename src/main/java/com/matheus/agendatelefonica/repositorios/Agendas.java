package com.matheus.agendatelefonica.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.agendatelefonica.entidades.Agenda;

public interface Agendas extends JpaRepository<Agenda, Long>{

}
