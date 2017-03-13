package com.lincolnluiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lincolnluiz.entity.Usuario;

@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioController {
	
	@RequestMapping(method = RequestMethod.GET)
	public Usuario get() {
		return null;
	}

}
