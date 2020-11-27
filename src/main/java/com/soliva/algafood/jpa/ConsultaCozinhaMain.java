package com.soliva.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.soliva.algafood.AlgafoodApiApplication;
import com.soliva.algafood.domain.model.Cozinha;
import com.soliva.algafood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		// Alt + Shift + L
		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		// Alt + Shift + r
		List<Cozinha> todasCozinhas = cozinhas.listar();
		
		for (Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}
