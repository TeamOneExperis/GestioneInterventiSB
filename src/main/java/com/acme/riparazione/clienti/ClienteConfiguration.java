package com.acme.riparazione.clienti;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.acme.riparazione.clienti.aziende.Azienda;
import com.acme.riparazione.clienti.privati.Privato;
import com.github.javafaker.Faker;

@Configuration
public class ClienteConfiguration {
	
	private static final Faker faker = new Faker( new Locale("it-IT"));

	

	
	@Bean("azienda")
	@Scope("prototype")
	public Cliente newAzienda() {
		
		Azienda a = new Azienda();
		
		a.setNome(faker.company().name());
		a.setCitta(faker.address().city());
		a.setIndirizzo(faker.address().zipCode());
		a.setPiva(faker.instance().bothify("???###??##??##"));

		
		
		return a;
		
	}
	
	
	@Bean("privato")
	@Scope("prototype")
	public Cliente newPrivato() {
		
		Privato p = new Privato();
		
		p.setNome(faker.name().firstName());
		p.setCognome(faker.name().lastName());
		p.setCitta(faker.address().city());
		p.setIndirizzo(faker.address().zipCode());
		p.setCf(faker.instance().bothify("???###??##??##"));
		
		
		
		return p;
		
	}
}
