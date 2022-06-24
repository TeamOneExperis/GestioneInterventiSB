package com.acme.riparazione.interventi.sostituzioni;

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
@RequestMapping("/sostituzione")
public class SostituzioneController {
	
	@Autowired
	private SostituzioneRepository sostituzioneRepository;
	
	@GetMapping
	public ResponseEntity<?> getSostituzioni(){
		
		return ResponseEntity.ok(sostituzioneRepository.findAll()); 
		
	}
	
	@PostMapping
	public ResponseEntity<?> insertSostituzione(@RequestBody Sostituzione sostituzione ){
		return ResponseEntity.ok(sostituzioneRepository.save(sostituzione));
	}
	
	@PutMapping("/${id}")
	public ResponseEntity<?> updateSostituzione(@RequestBody Sostituzione sostituzione, @PathVariable long id){
		
		Sostituzione sostituzione2 = sostituzioneRepository.findById(id).get();

		BeanUtils.copyProperties(sostituzione, sostituzione2);
		
		sostituzioneRepository.save(sostituzione2);
		
		return ResponseEntity.ok("aggiornamento effettuato");		
	}
	
	@DeleteMapping("/${id}")
	public ResponseEntity<?> removeSostituzione(@PathVariable long id){
		
		sostituzioneRepository.deleteById(id);
		
		return ResponseEntity.ok("eliminazione effettuata");
	}
	

}
