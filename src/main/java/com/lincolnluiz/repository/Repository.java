package com.lincolnluiz.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface Repository<Entidade> extends PagingAndSortingRepository<Entidade, Long> {
	
}
