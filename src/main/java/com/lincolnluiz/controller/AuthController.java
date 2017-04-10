package com.lincolnluiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.service.AuthService;
import com.lincolnluiz.service.IUsuarioService;
import com.lincolnluiz.util.SegurancaUtil;

@RestController
@RequestMapping(value = "api/auth")
public class AuthController {
	
	@Autowired AuthService authService;
	
	@Autowired IUsuarioService usuarioService;

	@RequestMapping(method = RequestMethod.POST)
	public Usuario authentication(@Param(value = "email") String email,
			@Param(value = "senha") String senha) {
		
		Usuario usuario = usuarioService.getUsuarioByEmail(email);
		String senhaCriptografada = SegurancaUtil.criptografar(senha);
		if (senhaCriptografada.equals(usuario.getSenha())) {
			usuario.setToken(authService.authentication(usuario));
			return usuario;
		}
		
		throw new IllegalArgumentException("Email ou senha inválido(s)");		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Usuario getList() {
		return new Usuario();
	}
	
	@RequestMapping(value = "cadastrar", method = RequestMethod.POST)
	public Usuario cadastrar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@RequestMapping(value = "token/{oldToken}", method = RequestMethod.GET)
	@Secured("sdasdfdsa")
	public Usuario getToken(@PathVariable(name = "oldToken") String oldToken) {
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
