package com.lincolnluiz.service;

import java.util.Date;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lincolnluiz.entity.DataCriacaoAtualizacao;

public abstract class AbstractService<Entidade> implements Service<Entidade> {

	public abstract PagingAndSortingRepository<Entidade, Long> getRepository();
	
	@Override
	public Entidade save(Entidade entidade) {
		atualizaDataCriacao(entidade);
		return getRepository().save(entidade);
	}

	@Override
	public Entidade find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entidade update(Entidade entidade) {
		atualizaDataAtualizacao(entidade);
		return getRepository().save(entidade);
	}

	@Override
	public void delete(Entidade entidade) {
		// TODO Auto-generated method stub
		
	}
	
	private void atualizaDataCriacao(Entidade entidade) {
		
		if (entidade instanceof DataCriacaoAtualizacao) {
			((DataCriacaoAtualizacao) entidade).setDataCriacao(new Date());
			((DataCriacaoAtualizacao) entidade).setDataAtualiacao(new Date());
		}
	}
	
	private void atualizaDataAtualizacao(Entidade entidade) {
		
		if (entidade instanceof DataCriacaoAtualizacao) {
			((DataCriacaoAtualizacao) entidade).setDataAtualiacao(new Date());
		}
	}
	
}
