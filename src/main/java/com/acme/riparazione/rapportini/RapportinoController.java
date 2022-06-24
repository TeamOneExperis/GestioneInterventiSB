package com.acme.riparazione.rapportini;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rapportini")
public class RapportinoController {
	
	@PostMapping
	public ResponseEntity<?> inserisciRapportino(@RequestBody InserisciRapportinoRequest dto){
		
		return ResponseEntity.ok("rapportino inserito");
	}
	
}
