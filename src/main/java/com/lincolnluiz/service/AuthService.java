package com.lincolnluiz.service;

import com.lincolnluiz.entity.Usuario;

public interface AuthService {
	
	String gerarToken(Usuario usuario);

}
