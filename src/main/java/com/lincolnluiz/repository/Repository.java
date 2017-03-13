package com.lincolnluiz.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface Repository<Entidade> extends PagingAndSortingRepository<Entidade, Long> {
	

}
