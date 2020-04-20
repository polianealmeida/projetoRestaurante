package com.capgemini.pedido.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("restaurante")
public interface RestauranteClient {

}
