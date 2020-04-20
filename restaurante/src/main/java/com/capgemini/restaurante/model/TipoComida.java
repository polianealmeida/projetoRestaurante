package com.capgemini.restaurante.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "TIPO_COMIDA")
public class TipoComida {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(updatable = false, nullable = false)
	private String id;

	@Column
	private String codigo;

	@Column
	private String descricao;

	@OneToMany(mappedBy = "tipoComida")
	private List<Restaurante> restaurantes;

	public TipoComida() {
	}

	public TipoComida(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
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

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

}
