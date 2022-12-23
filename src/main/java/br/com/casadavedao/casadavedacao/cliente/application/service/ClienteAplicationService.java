package br.com.casadavedao.casadavedacao.cliente.application.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteListResponse;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteResponse;
import br.com.casadavedao.casadavedacao.cliente.application.repository.ClienteRepository;
import br.com.casadavedao.casadavedacao.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteAplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicio] ClienteAplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteAplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicio] ClienteAplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteAplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}
}




