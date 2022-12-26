package br.com.casadavedao.casadavedacao.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.casadavedao.casadavedacao.cliente.domain.Avaliacao;
import br.com.casadavedao.casadavedacao.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
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
	
	public ClienteDetalhadoResponse(UUID idCliente, String nomeCompleto, String email, String celular, String telefone,
			Sexo sexo, LocalDate dataNascimento, String rg, String cpf, Avaliacao avaliacao) {
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.avaliacao = avaliacao;
	}
}
