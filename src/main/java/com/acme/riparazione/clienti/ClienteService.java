package com.acme.riparazione.clienti;


import org.springframework.stereotype.Service;

import com.acme.riparazione.clienti.aziende.Azienda;
import com.acme.riparazione.clienti.aziende.InserimentoAziendaRequest;
import com.acme.riparazione.clienti.privati.InserimentoPrivatiRequest;
import com.acme.riparazione.clienti.privati.Privato;

public interface ClienteService {
	
	Azienda inserisciCliente(InserimentoAziendaRequest dto);
	Privato inserisciCliente(InserimentoPrivatiRequest dto);

}