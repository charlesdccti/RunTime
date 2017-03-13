package com.lincolnluiz.repository;

import org.springframework.beans.factory.annotation.Autowired;

import com.lincolnluiz.entity.Usuario;

public class UsuarioRepositoryImpl extends AbstractRepositoy<UsuarioRepository, Usuario> implements Repository<Usuario> {

	@Autowired UsuarioRepository usuarioRepository;

	@Override
	public UsuarioRepository getRepostiory() {
		return usuarioRepository;
	}
	
	
}
