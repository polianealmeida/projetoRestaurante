package com.capgemini.restaurante.dto;

public class TipoComidaDTO {
	private String id;
	private String codigo;
	private String descricao;

	public TipoComidaDTO() {
	}

	public TipoComidaDTO(String id, String codigo, String descricao) {
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
	}

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

}
