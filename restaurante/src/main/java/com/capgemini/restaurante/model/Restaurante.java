package com.capgemini.restaurante.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "RESTAURANTE")

public class Restaurante {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(updatable = false, nullable = false)
	private String id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_comida", unique = true)
	private TipoComida tipoComida;

	@Column(name = "id_tipo_comida", insertable = false, updatable = false)
	private String idTipoComida;

	@Column(nullable = false, unique = true)
	private String codigo;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private String endereco;

	@Column
	private BigDecimal longitude;

	@Column
	private BigDecimal latitude;

	@OneToMany(mappedBy = "restaurante")
	private List<ItemCardapio> itensCardapio;

	public String getId() {
		return id;
	}

	public Restaurante() {
	}

	public Restaurante(String id) {
		this.id = id;
	}

	public TipoComida getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}

	public String getIdTipoComida() {
		return idTipoComida;
	}

	public void setIdTipoComida(String idTipoComida) {
		this.idTipoComida = idTipoComida;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public List<ItemCardapio> getItensCardapio() {
		return itensCardapio;
	}

}
