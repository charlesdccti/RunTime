package com.lincolnluiz.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class AbstractRepositoy<RepositoryInterface extends PagingAndSortingRepository<Entidade, Long>, Entidade> implements Repository<Entidade> {

	public abstract RepositoryInterface getRepostiory();
	
	@Override
	public Entidade save(Entidade entidade) {
		return getRepostiory().save(entidade);
	}
	
}
