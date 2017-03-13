package com.lincolnluiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.service.AuthService;

@RestController
@RequestMapping(value = "api/auth")
public class AuthController {
	
	@Autowired AuthService authService;

	@RequestMapping(method = RequestMethod.POST)
	public Usuario authentication(@Param(value = "email") String email,
			@Param(value = "senha") String senha) {
		
		Usuario usuario = new Usuario();
		usuario.setEmail(email);
		
		usuario.setSenha(authService.gerarToken(usuario));
		
		return usuario;
	}
	
	@RequestMapping(value = "token", method = RequestMethod.GET)
	public Usuario getToken(@PathVariable String oldToken) {
		Usuario usuario = new Usuario();
		
		return usuario;
	}
	
	@RequestMapping(value = "enviarEmail", method = RequestMethod.GET)
	public void enviarEmailConfirmacao() {
		throw new RuntimeException("Teste de exception");
	}
	
	@RequestMapping(value = "confirmar", method = RequestMethod.GET)
	public void confirmar() {
		
	}
	
}
