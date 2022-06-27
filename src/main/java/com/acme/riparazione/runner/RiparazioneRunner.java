package com.acme.riparazione.runner;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.acme.riparazione.clienti.Azienda;
import com.acme.riparazione.clienti.AziendaRepository;
import com.acme.riparazione.clienti.Privato;
import com.acme.riparazione.clienti.PrivatoRepository;
import com.acme.riparazione.tecnici.Tecnico;
import com.acme.riparazione.tecnici.TecnicoRepository;
import com.github.javafaker.Faker;

@Component
public class RiparazioneRunner implements ApplicationRunner {
	
	Faker fakerIta = new Faker(new Locale("it-IT"));
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private AziendaRepository aziendaRepo;
	
	@Autowired
	private PrivatoRepository privatoRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		for (int i = 0; i < 30; i++) {
			Tecnico tecnico = new Tecnico();
			tecnico.setNomeTecnico(fakerIta.address().firstName());
			tecnico.setCognomeTecnico(fakerIta.address().lastName());
			tecnico.setCodiceFiscaleTecnico(fakerIta.bothify("???#?###?#?").toUpperCase());
			tecnicoRepository.save(tecnico);
			
			Azienda azienda = new Azienda();
			azienda.setCitta(fakerIta.address().city());
			azienda.setIndirizzo(fakerIta.address().streetAddress());
			azienda.setNomeCliente(fakerIta.address().firstName() + " S.p.a.");
			azienda.setPartitaIva(fakerIta.numerify("#########"));
			aziendaRepo.save(azienda);
			
			Privato privato = new Privato();
			privato.setCitta(fakerIta.address().city());
			privato.setIndirizzo(fakerIta.address().streetAddress());
			privato.setNomeCliente(fakerIta.address().firstName() + " " + fakerIta.address().lastName());
			privato.setCodiceFiscalePrivato(fakerIta.bothify("???#?###?#?").toUpperCase());
			privatoRepo.save(privato);
			
		}
		
	}

}
