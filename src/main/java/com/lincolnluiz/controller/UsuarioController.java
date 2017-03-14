package com.lincolnluiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lincolnluiz.entity.Usuario;
import com.lincolnluiz.service.IUsuarioService;

@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioController {
	
	@Autowired IUsuarioService usuarioService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Usuario get() {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Usuario salvar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}

}
