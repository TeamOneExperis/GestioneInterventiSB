package com.acme.riparazione.clienti.privati;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.acme.riparazione.clienti.aziende.Azienda;
@Repository
public interface PrivatoRepository extends PagingAndSortingRepository<Privato, Long> {
	
	public Privato findByCF(String codice);
	public boolean existsByCF(String codice);

}
