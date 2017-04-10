package com.lincolnluiz.service;

import com.lincolnluiz.entity.Usuario;

public interface AuthService {
	
	String authentication(Usuario usuario);
	
	Usuario getUsuarioByEmail(String email);

}
