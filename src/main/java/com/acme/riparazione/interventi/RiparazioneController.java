package com.acme.riparazione.interventi;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/riparazione")
public class RiparazioneController {
	
	@Autowired
	private RiparazioneRepository riparazioneRepository;
	
	@GetMapping
	public ResponseEntity<?> getRiparazioni(){
		
		return ResponseEntity.ok(riparazioneRepository.findAll()); 
		
	}
	
	@PostMapping
	public ResponseEntity<?> insertRiparazioni(@RequestBody Riparazione riparazione ){
		return ResponseEntity.ok(riparazioneRepository.save(riparazione));
	}
	
	@PutMapping("/${id}")
	public ResponseEntity<?> updateRiparazioni(@RequestBody Riparazione riparazione, @PathVariable long id){
		
		Riparazione riparazione2 = riparazioneRepository.findById(id).get();

		BeanUtils.copyProperties(riparazione, riparazione2);
		
		riparazioneRepository.save(riparazione2);
		
		return ResponseEntity.ok("aggiornamento effettuato");		
	}
	
	@DeleteMapping("/${id}")
	public ResponseEntity<?> removeRiparazioni(@PathVariable long id){
		
		riparazioneRepository.deleteById(id);
		
		return ResponseEntity.ok("eliminazione effettuata");
	}
	
	
	
	
	
}
