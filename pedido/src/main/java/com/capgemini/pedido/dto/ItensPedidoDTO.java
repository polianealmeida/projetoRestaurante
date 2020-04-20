package com.capgemini.pedido.dto;

public class ItensPedidoDTO {

	private Integer codigo;
	private String idItemCardapio;
	private String quantidade;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getIdItemCardapio() {
		return idItemCardapio;
	}

	public void setIdItemCardapio(String idItemCardapio) {
		this.idItemCardapio = idItemCardapio;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
