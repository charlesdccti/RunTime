package com.lincolnluiz.entity;

public enum IndicadorStatus {
	
	ATIVO(0),
	INATIVO(1);
	
	private int indicadorStatus;
	
	private IndicadorStatus(int indicadorStatus) {
		this.indicadorStatus = indicadorStatus;
	}

}
