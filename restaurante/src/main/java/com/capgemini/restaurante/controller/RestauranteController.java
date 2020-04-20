package com.capgemini.restaurante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.restaurante.dto.BuscaGeolocalizacaoDTO;
import com.capgemini.restaurante.dto.RestauranteDTO;
import com.capgemini.restaurante.service.RestauranteService;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

	@Autowired
	private RestauranteService restauranteService;

	@RequestMapping("/{descricao}")
	public List<RestauranteDTO> buscarRestaruantePorDescricao(@PathVariable String descricao) {
		return restauranteService.buscarRestaruantePorDescricao(descricao);
	}

	@RequestMapping("/tipo-comida/{idTtipoComida}")
	public List<RestauranteDTO> buscarRestaruantePorNome(@PathVariable String idTtipoComida) {
		return restauranteService.buscarRestaruantePorIdTipoComida(idTtipoComida);
	}

	@RequestMapping("/geolocalizacao")
	public List<RestauranteDTO> buscarRestaruantePorGeolocalizacao(
			@RequestBody BuscaGeolocalizacaoDTO buscaGeolocalizacao) {
		return restauranteService.buscarRestaruantePorGeolocalizacao(buscaGeolocalizacao);
	}

	@PostMapping
	public void salvarRestaurante(@RequestBody RestauranteDTO restaurante) {
		restauranteService.salvarRestaurante(restaurante);
	}

	@PutMapping
	public void atualizarRestaurante(@RequestBody RestauranteDTO restaurante) {
		restauranteService.salvarRestaurante(restaurante);
	}
}
