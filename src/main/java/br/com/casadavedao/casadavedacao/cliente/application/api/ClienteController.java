package br.com.casadavedao.casadavedacao.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	@Override
	public ClienteResponse PostCliente(ClienteRequest clienteRequest) {
			log.info("[inicio] ClienteController - PostCliente");
			log.info("[finaliza] ClienteController - PostCliente");
		return null;
	}
}
