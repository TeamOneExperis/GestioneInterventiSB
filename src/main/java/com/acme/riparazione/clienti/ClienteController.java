package com.acme.riparazione.clienti;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.riparazione.clienti.aziende.InserimentoAziendaRequest;
import com.acme.riparazione.clienti.privati.InserimentoPrivatiRequest;

@RestController
@RequestMapping("/clienti")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	ClienteServiceImp clienteService;
	
	

	@GetMapping("/pagato")
	public void getClientiCheHannoPagato() {
	}

	@GetMapping("/{clienteId}")
	public  ResponseEntity<?>  getCliente(@PathVariable  long id) {
		
		if (clienteRepo.existsById(id)) {
			
			Optional<ClienteAbstract> c = clienteRepo.findById(id);
			
			return ResponseEntity.ok(c);
			
		} else {
			
			return new ResponseEntity("Cliente"+ id + "non trovato" , HttpStatus.NOT_FOUND);
			
			
		}

		}
	
	

	@PostMapping("/acme")
	public ResponseEntity<?> inserisciCliente(@RequestBody InserimentoAziendaRequest dto) {

		clienteService.inserisciCliente(dto);
		return ResponseEntity.ok("Azienda");
	}

	@PostMapping
	public ResponseEntity<?> inserisciCliente(@RequestBody InserimentoPrivatiRequest dto) {

		clienteService.inserisciCliente(dto);
		return ResponseEntity.ok("Privato");
	}



}
