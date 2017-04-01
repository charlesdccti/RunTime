package com.lincolnluiz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.repository.UsuarioRepository;
import com.lincolnluiz.service.AbstractService;
import com.lincolnluiz.service.IUsuarioService;

@Service
public class UsuarioService extends AbstractService<Usuario> implements IUsuarioService {

	@Autowired UsuarioRepository usuarioRepository;
	
	@Override
	public PagingAndSortingRepository<Usuario, Long> getRepository() {
		return usuarioRepository;
	}

}
