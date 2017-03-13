package com.lincolnluiz.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "atividade")
public class Atividade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long idAtividade;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private Cartao cartao;
	private String descricao;
	private String anotacao;
	private Long tempoGasto;
	private IndicadorStatus statusExecucao;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_atividade")
	public Long getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(Long idAtividade) {
		this.idAtividade = idAtividade;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_cricao")
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_atualizacao")
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_cartao", foreignKey = @ForeignKey(name = "fk_atividade_id_cartao"))
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	@Column(name = "descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name = "anotacao")
	public String getAnotacao() {
		return anotacao;
	}
	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}
	
	@Column(name = "tempo_gasto")
	public Long getTempoGasto() {
		return tempoGasto;
	}
	public void setTempoGasto(Long tempoGasto) {
		this.tempoGasto = tempoGasto;
	}
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "status_execucao")
	public IndicadorStatus getStatusExecucao() {
		return statusExecucao;
	}
	public void setStatusExecucao(IndicadorStatus statusExecucao) {
		this.statusExecucao = statusExecucao;
	}
	
}
