package br.com.casadavedao.casadavedacao.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteAlteradoRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteDetalhadoResponse;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteListResponse;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void pathAlteraCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest);
}
