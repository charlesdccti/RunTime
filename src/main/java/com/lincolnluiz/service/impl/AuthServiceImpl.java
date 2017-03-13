package com.lincolnluiz.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public String authentication(Usuario usuario) {
		
		String uuid = usuario.getEmail().substring(0, 4);
		String token = UUID.fromString(uuid).toString();
		
			
		return token;
	}

}
