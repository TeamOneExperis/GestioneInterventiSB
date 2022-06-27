package com.acme.riparazione.rapportini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rapportini")
public class RapportinoController {
	
	@Autowired
	private RapportinoRepository rapportinoRepository;
	
	@Autowired
	private RapportinoService rapportinoService;
	
	@GetMapping
	public ResponseEntity<List<Rapportino>>  getRapportini() {
		return ResponseEntity.ok( (List<Rapportino>) rapportinoRepository.findAll()	);
	}
	
	@PostMapping("/testa/azienda")
	public ResponseEntity<?> inserisciTestaRapportino(@RequestBody InserisciTestaRapportinoAziendaRequest dto){
		rapportinoService.inserisciTestaRapportino(dto);
		return ResponseEntity.ok("rapportino inserito");
	}
	
	@PostMapping("/testa/privato")
	public ResponseEntity<?> inserisciTestaRapportino(@RequestBody InserisciTestaRapportinoPrivatoRequest dto){
		rapportinoService.inserisciTestaRapportino(dto);
		return ResponseEntity.ok("rapportino inserito");
	}
}
