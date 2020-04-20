package com.capgemini.restaurante.dto;

import java.math.BigDecimal;

public class RestauranteDTO {
	private String id;
	private String codigo;
	private String descricao;
	private String endereco;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private TipoComidaDTO tipoComida;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public TipoComidaDTO getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TipoComidaDTO tipoComida) {
		this.tipoComida = tipoComida;
	}

}
