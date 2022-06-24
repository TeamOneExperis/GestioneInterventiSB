package com.acme.riparazione.clienti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InserimentoAziendaRequest {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private String citta;
	private String pIva;


}
