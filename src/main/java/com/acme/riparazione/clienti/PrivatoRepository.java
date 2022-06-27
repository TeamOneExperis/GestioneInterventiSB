package com.acme.riparazione.clienti;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PrivatoRepository extends PagingAndSortingRepository<Privato, Long> {
	public boolean existsByCodiceFiscalePrivato(String codiceFiscalePrivato);
	public Privato findByCodiceFiscalePrivato(String codiceFiscalePrivato);
	
}
