package com.acme.riparazione.clienti.privati;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserimentoPrivatiRequest {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private String citta;
	private String cf;

}
