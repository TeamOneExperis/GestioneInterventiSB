package com.acme.riparazione.rapportini;

public interface RapportinoService {
	public Rapportino inserisciTestaRapportino (InserisciTestaRapportinoAziendaRequest dto);
	public Rapportino inserisciTestaRapportino (InserisciTestaRapportinoPrivatoRequest dto);
}