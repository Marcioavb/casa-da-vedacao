package br.com.casadavedao.casadavedacao.cliente.application.service;

import java.util.List;

import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteListResponse;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
}
