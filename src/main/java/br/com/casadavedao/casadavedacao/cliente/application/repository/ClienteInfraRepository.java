package br.com.casadavedao.casadavedacao.cliente.application.repository;

import org.springframework.stereotype.Repository;

import br.com.casadavedao.casadavedacao.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicio] ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[inicio] ClienteInfraRepository - salva");
		return cliente;
	}
}


