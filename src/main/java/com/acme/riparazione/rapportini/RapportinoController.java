package com.acme.riparazione.rapportini;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.riparazione.clienti.ClienteRepository;
import com.acme.riparazione.tecnici.Tecnico;
import com.acme.riparazione.tecnici.TecnicoRepository;

@RestController
@RequestMapping("/rapportini")
public class RapportinoController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private RapportinoRepository rapportinoRepository;
	
	
	
//	@Autowired
//	private RapportinoService rapportinoService;
	
	@GetMapping
	public ResponseEntity<List<Rapportino>>  getRapportini() {
		return ResponseEntity.ok( (List<Rapportino>) rapportinoRepository.findAll()	);
	}
	
	
	
	@PostMapping("/testa")
	public ResponseEntity<?> inserisciTestaRapportino(@RequestBody InserisciTestaRapportinoRequest dto){
		Rapportino rapportino = new Rapportino();
		Tecnico tecnico;
		
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
		
		BeanUtils.copyProperties(dto, rapportino);
		rapportino.setTecnico(tecnico);
		rapportinoRepository.save(rapportino);
		tecnico.getRapportini().add(rapportino);
		
		
		return ResponseEntity.ok("rapportino inserito");
	}
	
}
