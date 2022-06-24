package com.acme.riparazione.clienti;

import com.acme.riparazione.clienti.aziende.Azienda;
import com.acme.riparazione.clienti.privati.Privato;

public interface ClienteService {
	
	Azienda inserisciCliente(InserimentoAziendaRequest dto);
	Privato inserisciCliente(InserimentoPrivatiRequest dto);

}