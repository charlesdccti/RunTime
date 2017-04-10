package com.lincolnluiz.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.service.AuthService;
import com.lincolnluiz.service.IUsuarioService;
import com.lincolnluiz.util.SegurancaUtil;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired IUsuarioService usuarioService;
	
	@Override
	public String authentication(Usuario usuario) {
		
		String token = SegurancaUtil.criptografar(usuario.getEmail() + new Date().toString());
		
		usuario.setToken(token);
		usuarioService.save(usuario);
			
		return token;
	}

	@Override
	public Usuario getUsuarioByEmail(String email) {
		return usuarioService.getUsuarioByEmail(email);
	}

}
