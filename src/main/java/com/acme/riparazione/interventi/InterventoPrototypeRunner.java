package com.acme.riparazione.interventi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InterventoPrototypeRunner implements ApplicationRunner{
	
	@Autowired
	@Qualifier("riparazione")
	ObjectProvider<Intervento> objectProviderRiparazione;
	@Autowired
	@Qualifier("sostituzione")
	ObjectProvider<Intervento> objectProviderSostituzione;
	@Autowired
	@Qualifier("verifica")
	ObjectProvider<Intervento> objectProviderVerifica;
	
	@Autowired
	InterventoRepository interventoRepository;
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		for (int i = 0; i < 30 ; i++) {
			
			List<Intervento> providers = new ArrayList<Intervento>();
			
			providers.add(objectProviderRiparazione.getObject());
			providers.add(objectProviderSostituzione.getObject());
			providers.add(objectProviderVerifica.getObject());
			
			interventoRepository.saveAll(providers);
			
		}
	}

}
