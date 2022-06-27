package com.acme.riparazione.clienti.aziende;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AziendaRepository extends PagingAndSortingRepository<Azienda, Long> {
	
	public Azienda findByPiva(String codice);
	public boolean existsByPiva(String codice);

}
