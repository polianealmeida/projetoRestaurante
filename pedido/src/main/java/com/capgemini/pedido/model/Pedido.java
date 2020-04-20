package com.capgemini.pedido.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Integer codigo;

	@Column(name = "id_item_cardapio")
	private String idItemCardapio;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusPedidoEnum status;

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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public StatusPedidoEnum getStatus() {
		return status;
	}

	public void setStatus(StatusPedidoEnum status) {
		this.status = status;
	}

}
