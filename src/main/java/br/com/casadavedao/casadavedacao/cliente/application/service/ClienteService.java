package br.com.casadavedao.casadavedacao.cliente.application.service;

import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
