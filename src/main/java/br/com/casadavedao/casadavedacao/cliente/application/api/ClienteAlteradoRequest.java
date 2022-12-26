package br.com.casadavedao.casadavedacao.cliente.application.api;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import br.com.casadavedao.casadavedacao.cliente.domain.Avaliacao;
import br.com.casadavedao.casadavedacao.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteAlteradoRequest {
	
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String rg;
	@CPF
	private String cpf;
	private Avaliacao avaliacao;
}
