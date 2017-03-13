package com.lincolnluiz.service.impl;

import java.security.SecureRandom;

import org.springframework.stereotype.Service;

import com.lincolnluiz.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public String gerarToken(com.lincolnluiz.entity.Usuario usuario) {
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[20];
	    random.nextBytes(bytes);
	    String token = bytes.toString();
		return token;
	}

}
