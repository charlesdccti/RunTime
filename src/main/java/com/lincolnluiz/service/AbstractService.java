package com.lincolnluiz.service;

import com.lincolnluiz.repository.Repository;

public abstract class AbstractService<Entidade> implements Service<Entidade> {

	abstract Repository<Entidade> getRepository();
	
	@Override
	public Entidade save(Entidade entidade) {
		return null;
	}

	@Override
	public Entidade find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entidade update(Entidade entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Entidade entidade) {
		// TODO Auto-generated method stub
		
	}
	
}
