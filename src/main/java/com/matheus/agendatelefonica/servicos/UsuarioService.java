package com.matheus.agendatelefonica.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheus.agendatelefonica.entidades.Usuario;
import com.matheus.agendatelefonica.repositorios.Usuarios;

@Service
public class UsuarioService {
	
	@Autowired
	private Usuarios usuarios;
	
	// salvar
	public Usuario salvar (Usuario usuario) {
		usuarios.save(usuario);
		return usuario;
	}
	
	// deletar
	public void deletar (Long id) {
		try {
			usuarios.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// atualizar
	public Usuario atualizar (Long id, Usuario usuario) {
		try {
			Usuario entidade = usuarios.getReferenceById(id);
			atualizarDados(entidade, usuario);
			return usuarios.save(entidade);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// atualizar dados de uma entidade
	public void atualizarDados (Usuario entidade, Usuario obj) {
		entidade.setNomeUsuario(obj.getNomeUsuario());
		entidade.setSenha(obj.getSenha());
	}
	
	// obter todos
	public List<Usuario> obterTodos (){
		return usuarios.findAll();
	}
	
	// obter por nome
	public Optional<Usuario> obterPorId(Long id) {
		Optional<Usuario> obj = usuarios.findById(id);
		return obj;
	}
	
}
