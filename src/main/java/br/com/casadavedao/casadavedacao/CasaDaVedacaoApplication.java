package br.com.casadavedao.casadavedacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class CasaDaVedacaoApplication {
	
	@GetMapping
	public String getTesteHome () {
		return "Casa Da Vedação";
	}

	public static void main(String[] args) {
		SpringApplication.run(CasaDaVedacaoApplication.class, args);
	}
}
