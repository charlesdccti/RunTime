package com.lincolnluiz.service;

public interface Service<Entidade> {
	
	Entidade find(Object id);
	
	Entidade save(Entidade entidade);
	
	Entidade update(Entidade entidade);
	
	void delete(Entidade entidade);

}
