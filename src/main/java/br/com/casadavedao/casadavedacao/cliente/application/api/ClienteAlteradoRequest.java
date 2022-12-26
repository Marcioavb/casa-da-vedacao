package br.com.casadavedao.casadavedacao.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.casadavedao.casadavedacao.cliente.domain.Avaliacao;
import br.com.casadavedao.casadavedacao.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteAlteradoRequest {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String rg;
	private String cpf;
	private Avaliacao avaliacao;

}
