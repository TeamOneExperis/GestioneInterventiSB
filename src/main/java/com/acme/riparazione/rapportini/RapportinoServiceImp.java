package com.acme.riparazione.rapportini;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.riparazione.clienti.Azienda;
import com.acme.riparazione.clienti.AziendaRepository;
import com.acme.riparazione.clienti.Privato;
import com.acme.riparazione.clienti.PrivatoRepository;
import com.acme.riparazione.tecnici.Tecnico;
import com.acme.riparazione.tecnici.TecnicoRepository;

@Service
public class RapportinoServiceImp implements RapportinoService {
	
	@Autowired
	private RapportinoRepository rapportinoRepository;
	
	@Autowired
	private AziendaRepository aziendaRepository;
	
	@Autowired
	private PrivatoRepository privatoRepository;
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	
	public Rapportino inserisciTestaRapportino (InserisciTestaRapportinoAziendaRequest dto) {
		
		Rapportino rapportino = new Rapportino();
		Tecnico tecnico;
		Azienda azienda;
		
		if(tecnicoRepository.existsByCodiceFiscaleTecnico(dto.getCodiceFiscaleTecnico())) {
			tecnico = tecnicoRepository.findByCodiceFiscaleTecnico(dto.getCodiceFiscaleTecnico());
			System.out.println("sono dentro l'if tecnico");
		}
		else {
			tecnico = new Tecnico();
			BeanUtils.copyProperties(dto, tecnico);
			tecnicoRepository.save(tecnico);
			System.out.println("sono dentro l'else tecnico");
		}
		
		if(aziendaRepository.existsByPartitaIva(dto.getPartitaIva())) {
			azienda = aziendaRepository.findByPartitaIva(dto.getPartitaIva());
			System.out.println("sono dentro l'if azienda");
		}
		else {
			azienda = new Azienda();
			BeanUtils.copyProperties(dto, azienda);
			aziendaRepository.save(azienda);
			System.out.println("sono dentro l'else azienda");
		}
		
		
		BeanUtils.copyProperties(dto, rapportino);
		rapportino.setTecnico(tecnico);
		rapportino.setCliente(azienda);
		rapportinoRepository.save(rapportino);
		tecnico.getRapportini().add(rapportino);
		azienda.getRapportini().add(rapportino);
		
		return rapportino;
	}
	
	
	public Rapportino inserisciTestaRapportino (InserisciTestaRapportinoPrivatoRequest dto) {
	
		Rapportino rapportino = new Rapportino();
		Tecnico tecnico;
		Privato privato;
		
		if(tecnicoRepository.existsByCodiceFiscaleTecnico(dto.getCodiceFiscaleTecnico())) {
			tecnico = tecnicoRepository.findByCodiceFiscaleTecnico(dto.getCodiceFiscaleTecnico());
			System.out.println("sono dentro l'if tecnico");
		}
		else {
			tecnico = new Tecnico();
			BeanUtils.copyProperties(dto, tecnico);
			tecnicoRepository.save(tecnico);
			System.out.println("sono dentro l'else tecnico");
		}
		
		if(privatoRepository.existsByCodiceFiscalePrivato(dto.getCodiceFiscalePrivato())) {
			privato = privatoRepository.findByCodiceFiscalePrivato(dto.getCodiceFiscalePrivato());
			System.out.println("sono dentro l'if privato");
		}
		else {
			privato = new Privato();
			BeanUtils.copyProperties(dto, privato);
			privatoRepository.save(privato);
			System.out.println("sono dentro l'else privato");
		}
		
		
		BeanUtils.copyProperties(dto, rapportino);
		rapportino.setTecnico(tecnico);
		rapportino.setCliente(privato);
		rapportinoRepository.save(rapportino);
		tecnico.getRapportini().add(rapportino);
		privato.getRapportini().add(rapportino);
		
		return rapportino;
		
	}
}
