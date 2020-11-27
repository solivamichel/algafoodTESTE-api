package com.soliva.algafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.soliva.algafood.AlgafoodApiApplication;
import com.soliva.algafood.domain.model.Cozinha;
import com.soliva.algafood.domain.repository.CozinhaRepository;

public class BuscaConsultaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		// Alt + Shift + L
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cozinhaRepository.buscar(1L);
		
		System.out.println(cozinha.getNome());
	}
}
