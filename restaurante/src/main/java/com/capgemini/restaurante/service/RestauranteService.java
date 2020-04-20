package com.capgemini.restaurante.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.restaurante.dto.BuscaGeolocalizacaoDTO;
import com.capgemini.restaurante.dto.RestauranteDTO;
import com.capgemini.restaurante.dto.TipoComidaDTO;
import com.capgemini.restaurante.model.Restaurante;
import com.capgemini.restaurante.model.TipoComida;
import com.capgemini.restaurante.repository.RestauranteRepository;

@Service
public class RestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;

	public List<RestauranteDTO> buscarRestaruantePorDescricao(String descricao) {
		List<RestauranteDTO> restaurantes = new ArrayList<>();

		restauranteRepository.findByDescricaoLike("%" + descricao + "%").forEach(a -> {
			restaurantes.add(entityToDTO(a));
		});

		return restaurantes;
	}

	public List<RestauranteDTO> buscarRestaruantePorIdTipoComida(String idTtipoComida) {
		List<RestauranteDTO> restaurantes = new ArrayList<>();

		restauranteRepository.findByIdTipoComida(idTtipoComida).forEach(a -> {
			restaurantes.add(entityToDTO(a));
		});

		return restaurantes;
	}

	public List<RestauranteDTO> buscarRestaruantePorGeolocalizacao(BuscaGeolocalizacaoDTO buscaGeolocalizacao) {

		return null;
	}

	private RestauranteDTO entityToDTO(Restaurante a) {
		RestauranteDTO r = new RestauranteDTO();

		r.setId(a.getId());
		r.setCodigo(a.getCodigo());
		r.setDescricao(a.getDescricao());
		r.setLatitude(a.getLatitude());
		r.setLongitude(a.getLongitude());
		r.setEndereco(a.getEndereco());
		r.setTipoComida(new TipoComidaDTO(a.getTipoComida().getId(), a.getTipoComida().getCodigo(),
				a.getTipoComida().getDescricao()));

		return r;

	}

	public void salvarRestaurante(RestauranteDTO restauranteDTO) {

		Restaurante restaurante = new Restaurante(restauranteDTO.getId());
		restaurante.setCodigo(restauranteDTO.getCodigo());
		restaurante.setDescricao(restauranteDTO.getDescricao());
		restaurante.setEndereco(restauranteDTO.getEndereco());
		restaurante.setLatitude(restauranteDTO.getLatitude());
		restaurante.setLongitude(restauranteDTO.getLongitude());
		restaurante.setTipoComida(new TipoComida(restauranteDTO.getTipoComida().getId()));

		restauranteRepository.save(restaurante);
	}

}
