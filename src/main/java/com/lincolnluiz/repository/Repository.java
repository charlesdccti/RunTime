package com.lincolnluiz.repository;

public interface Repository<Entidade> {
	
	Entidade save(Entidade entidade);

}
