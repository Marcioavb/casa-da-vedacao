package br.com.casadavedao.casadavedacao.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteAlteradoRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteDetalhadoResponse;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteListResponse;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteRequest;
import br.com.casadavedao.casadavedacao.cliente.application.api.ClienteResponse;
import br.com.casadavedao.casadavedacao.cliente.application.repository.ClienteRepository;
import br.com.casadavedao.casadavedacao.cliente.domain.Cliente;
import ch.qos.logback.core.net.server.Client;
import jakarta.validation.Valid;
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

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicio] ClienteAplicationService - buscaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] ClienteAplicationService - buscaClienteAtravesId");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[inicio] ClienteAplicationService - deletaClienteAtravesId");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		clienteRepository.deletaCliente(cliente);
		log.info("[finaliza] ClienteAplicationService - deletaClienteAtravesId");
	}

	@Override
	public void pathAlteraCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest) {
		log.info("[inicio] ClienteAplicationService - pathAlteraCliente");
		Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
		cliente.altera(clienteAlteradoRequest);
		clienteRepository.salva(cliente);
		log.info("[finaliza] ClienteAplicationService - pathAlteraCliente");
	}
}




