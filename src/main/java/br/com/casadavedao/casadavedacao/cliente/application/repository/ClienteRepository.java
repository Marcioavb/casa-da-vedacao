package br.com.casadavedao.casadavedacao.cliente.application.repository;

import br.com.casadavedao.casadavedacao.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
