package com.acme.riparazione.clienti;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.riparazione.clienti.aziende.Azienda;
import com.acme.riparazione.clienti.aziende.AziendaRepository;
import com.acme.riparazione.clienti.aziende.InserimentoAziendaRequest;
import com.acme.riparazione.clienti.privati.InserimentoPrivatiRequest;
import com.acme.riparazione.clienti.privati.Privato;
import com.acme.riparazione.clienti.privati.PrivatoRepository;

@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired private AziendaRepository aziendaRepo;
	@Autowired private PrivatoRepository privatoRepo;
	
	@Override
	public Azienda inserisciCliente(InserimentoAziendaRequest dto) {

		Azienda a;
		
		if ( aziendaRepo.existsByPiva(dto.getPiva()) ) {
			
			a = aziendaRepo.findByPiva(dto.getPiva());
			
		} else {
			
			a = new Azienda();
			BeanUtils.copyProperties(dto, a);
			aziendaRepo.save(a);

		}
		
		
		return a;
	}
	
	@Override
	public Privato inserisciCliente(InserimentoPrivatiRequest dto) {
		
		Privato p;
		
		if ( privatoRepo.existsByCf(dto.getCf()) ) {
			
			p = privatoRepo.findByCf(dto.getCf());
			
		} else {
			
			p = new Privato();
			BeanUtils.copyProperties(dto, p);
			privatoRepo.save(p);
		}
		
		
		return p;
	}
	

}