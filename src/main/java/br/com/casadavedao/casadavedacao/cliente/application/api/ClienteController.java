package br.com.casadavedao.casadavedacao.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.casadavedao.casadavedacao.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse PostCliente(ClienteRequest clienteRequest) {
		log.info("[inicio] ClienteController - PostCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - PostCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicio] ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[termino] ClienteController - getTodosClientes");
		return clientes;
	}
}


