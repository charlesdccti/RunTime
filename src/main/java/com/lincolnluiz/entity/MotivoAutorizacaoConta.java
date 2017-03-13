package com.lincolnluiz.entity;

public enum MotivoAutorizacaoConta {
	
	ATIVACAO_CONTA(0),
	RECUPERACAO_CONTA(1);
	
	private int motivacaoAutorizacaoConta;
	
	private MotivoAutorizacaoConta(int motivacaoAutorizacaoConta) {
		this.motivacaoAutorizacaoConta = motivacaoAutorizacaoConta;
	}

}
