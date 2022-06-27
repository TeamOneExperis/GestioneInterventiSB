package com.acme.riparazione.clienti;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.acme.riparazione.clienti.aziende.Azienda;
import com.acme.riparazione.clienti.privati.Privato;

@Component
public class PrototypeClientiRunner implements ApplicationRunner {


	@Autowired
	@Qualifier("azienda")
	ObjectProvider<Cliente> aziendaObjectProvider;
	
	
	@Autowired
	@Qualifier("privato")
	ObjectProvider<Cliente> privatoObjectProvider;
	
	@Autowired
	ClienteRepository clienteRepo; 
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {


		for (int i = 0; i < 30; i++) {
			
			Azienda a = (Azienda) aziendaObjectProvider.getObject(); // prende un prototipo di oggetto
			
			clienteRepo.save(a); //salva l'oggetto creato al interno del database
			
			
		}

		for (int i = 0; i < 30; i++) {
			
			Privato p = (Privato) privatoObjectProvider.getObject(); // prende un prototipo di oggetto
			
			clienteRepo.save(p); //salva l'oggetto creato al interno del database
			
			
		}
	}

}
