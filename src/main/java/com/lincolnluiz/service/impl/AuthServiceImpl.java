package com.lincolnluiz.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.service.AuthService;
import com.lincolnluiz.util.SegurancaUtil;

@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public String authentication(Usuario usuario) {
		
		String token = SegurancaUtil.criptografar(usuario.getEmail() + new Date().toString());
			
		return token;
	}

}
