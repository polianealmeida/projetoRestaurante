package com.capgemini.pedido.service;

import org.springframework.stereotype.Service;

import com.capgemini.pedido.dto.ItensPedidoDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class PedidoService {

	@HystrixCommand(fallbackMethod = "fecharPedidoFallback", threadPoolKey = "fecharPedidoThreadPool")
	public void fecharPedido(ItensPedidoDTO itensPedido) {
		// TODO Auto-generated method stub

	}

	public void fecharPedidoFallback(ItensPedidoDTO itensPedido) {
		// Chamar aqui o serviço de mensageria para processar o pedido depois
	}

	public void realizarPagamento(String codigoPedido) {
		// TODO Auto-generated method stub

	}

}
