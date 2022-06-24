package com.acme.riparazione.interventi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class VerificaController {
	
	@Autowired
	private VerificaRepository verificaRepository;
	
	@GetMapping
	public ResponseEntity<?> getVerifica(){
		
		return ResponseEntity.ok(verificaRepository.findAll()); 
		
	}
	
	@PostMapping
	public ResponseEntity<?> insertVerifica(@RequestBody Verifica verifica ){
		return ResponseEntity.ok(verificaRepository.save(verifica));
	}
	
	@PutMapping("/${id}")
	public ResponseEntity<?> updateVerifica(@RequestBody Verifica verifica, @PathVariable long id){
		
		Verifica verifica2 = verificaRepository.findById(id).get();

		BeanUtils.copyProperties(verifica, verifica2);
		
		verificaRepository.save(verifica2);
		
		return ResponseEntity.ok("aggiornamento effettuato");		
	}
	
	@DeleteMapping("/${id}")
	public ResponseEntity<?> removeVerifica(@PathVariable long id){
		
		verificaRepository.deleteById(id);
		
		return ResponseEntity.ok("eliminazione effettuata");
	}
	

}
