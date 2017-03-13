package com.lincolnluiz.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "cartao")
public class Cartao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idCartao;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private Usuario usuario;
	private String titulo;
	
	private Long tempoTotal;
	
	private List<Atividade> atividadeList;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_cartao")
	public Long getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(Long idCartao) {
		this.idCartao = idCartao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_criacao")
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
	@JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_cartao_id_usuario"))
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "titulo")
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Transient
	public Long getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(Long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	@OneToMany(mappedBy = "cartao", fetch = FetchType.LAZY, orphanRemoval = true)
	public List<Atividade> getAtividadeList() {
		return atividadeList;
	}

	public void setAtividadeList(List<Atividade> atividadeList) {
		this.atividadeList = atividadeList;
	}
	
	
	
	
}
