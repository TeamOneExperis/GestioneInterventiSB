package com.acme.riparazione.rapportini;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InserisciTestaRapportinoRequest {

	//relativa al tecnico
	private String nomeTecnico;
	private String cognomeTecnico;
	private String codiceFiscaleTecnico;
	
	//relativo al cliente
	private String nomeCliente;
	private String citta;
	private String indirizzo;
	private String codiceFiscale;
	private String partitaIva;
	
	//realtivo al rapportino
	private String data;
	private String numeroSeriale;
	
	
}
