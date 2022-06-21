package com.acme.riparazione.clienti;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("/clienti")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clientRepo;
	
	@GetMapping("/pagato")
	public void getClientiCheHannoPagato() {}
	
	@GetMapping("/{clienteId}")
	public  ResponseEntity<?>  getUtente(@PathVariable  long id) {
		
		if( clientRepo.existsById(id)) {
			Optional<Cliente> c =  clientRepo.findById(id);
			//return new ResponseEntity(u, HttpStatus.OK);
			
			return ResponseEntity.ok(c);
			
		} else {
			return new ResponseEntity("Cliente id " + id + " non trovato ", HttpStatus.NOT_FOUND );
		}
		
	}
}

