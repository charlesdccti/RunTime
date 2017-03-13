package com.lincolnluiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.repository.Repository;
import com.lincolnluiz.repository.UsuarioRepository;

@Service
public class UsuarioService extends AbstractService<Usuario> implements IUsuarioService {

	@Autowired UsuarioRepository usuarioRepository;
	
	@Override
	Repository<Usuario> getRepository() {
		return usuarioRepository;
	}
	
	
	
}
