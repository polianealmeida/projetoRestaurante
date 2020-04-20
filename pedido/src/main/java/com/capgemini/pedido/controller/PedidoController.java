package com.capgemini.pedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pedido.dto.ItensPedidoDTO;
import com.capgemini.pedido.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@PostMapping
	public void fecharPedido(@RequestBody ItensPedidoDTO itensPedido) {
		pedidoService.fecharPedido(itensPedido);
	}

	@RequestMapping("/{codigo}")
	public void realizarPagamentoPedido(@PathVariable String codigoPedido) {
		pedidoService.realizarPagamento(codigoPedido);
	}
}
