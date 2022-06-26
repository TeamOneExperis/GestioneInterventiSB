package com.acme.riparazione.runner;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.acme.riparazione.tecnici.Tecnico;
import com.acme.riparazione.tecnici.TecnicoRepository;
import com.github.javafaker.Faker;

@Component
public class RiparazioneRunner implements ApplicationRunner {
	
	Faker fakerIta = new Faker(new Locale("it-IT"));
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 30; i++) {
			Tecnico tecnico = new Tecnico();
			tecnico.setNomeTecnico(fakerIta.address().firstName());
			tecnico.setCognomeTecnico(fakerIta.address().lastName());
			tecnico.setCodiceFiscaleTecnico(fakerIta.bothify("???#?###?#?"));
			tecnicoRepository.save(tecnico);
			
			//Cliente cliente = new
			
			
		}
		
	}

}
