package com.acme.riparazione.interventi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

@Configuration
public class InterventoConfig {

	@Bean("riparazione")
	@Scope("prototype")
	public Intervento newRiparazione() {

		return new Riparazione().builder().descrizione(Faker.instance().commerce().productName())
				.prezzo(Faker.instance().number().randomDigit()).build();
	}

	@Bean("sostituzione")
	@Scope("prototype")
	public Intervento newSostituzione() {

		return new Sostituzione().builder().descrizione(Faker.instance().commerce().productName())
				.prezzo(Faker.instance().number().randomDigit()).build();
	}

	@Bean("verifica")
	@Scope("prototype")
	public Intervento newVerifica() {

		return new Verifica().builder().descrizione(Faker.instance().commerce().productName())
				.prezzo(Faker.instance().number().randomDigit()).build();
	}
}
