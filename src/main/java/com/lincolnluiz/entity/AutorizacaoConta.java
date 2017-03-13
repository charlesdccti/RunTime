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
@Table(name = "autorizaca_conta")
public class AutorizacaoConta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idAutorizacaoConta;
	private Date dataCricao;
	private Usuario usuario;
	private String token;
	private MotivoAutorizacaoConta motivo;
	private Date validade;
	private IndicadorStatus status;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_autorizacao_conta")
	public Long getIdAutorizacaoConta() {
		return idAutorizacaoConta;
	}
	public void setIdAutorizacaoConta(Long idAutorizacaoConta) {
		this.idAutorizacaoConta = idAutorizacaoConta;
	}
	
	@Temporal(TemporalType.TIME)
	@Column(name = "data_cricao")
	public Date getDataCricao() {
		return dataCricao;
	}
	public void setDataCricao(Date dataCricao) {
		this.dataCricao = dataCricao;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_auto_conta_id_usuario"))
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Column(name = "token")
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "motivo")
	public MotivoAutorizacaoConta getMotivo() {
		return motivo;
	}
	public void setMotivo(MotivoAutorizacaoConta motivo) {
		this.motivo = motivo;
	}
	
	@Temporal(TemporalType.TIME)
	@Column(name = "validade")
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "status")
	public IndicadorStatus getStatus() {
		return status;
	}
	public void setStatus(IndicadorStatus status) {
		this.status = status;
	}
	
}
