package br.com.casadavedao.casadavedacao.cliente.application.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.casadavedao.casadavedacao.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}
