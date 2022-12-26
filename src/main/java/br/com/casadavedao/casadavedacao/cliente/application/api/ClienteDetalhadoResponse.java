package br.com.casadavedao.casadavedacao.cliente.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.casadavedao.casadavedacao.cliente.domain.Avaliacao;
import br.com.casadavedao.casadavedacao.cliente.domain.Cliente;
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
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.sexo = cliente.getSexo();
		this.dataNascimento = cliente.getDataNascimento();
		this.rg = cliente.getCpf();
		this.cpf = cliente.getCpf();
		this.avaliacao = cliente.getAvaliacao();
	}
}

