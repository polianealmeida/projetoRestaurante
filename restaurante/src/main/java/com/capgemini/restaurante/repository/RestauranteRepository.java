package com.capgemini.restaurante.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.restaurante.model.Restaurante;

public interface RestauranteRepository extends CrudRepository<Restaurante, String> {

	public List<Restaurante> findByDescricaoLike(String nome);

	public List<Restaurante> findByIdTipoComida(String idTipoComida);

}
