package com.acme.riparazione.clienti;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AziendaRepository extends PagingAndSortingRepository<Azienda, Long> {
	public boolean existsByPartitaIva(String partitaIva);
	public Azienda findByPartitaIva(String partitaIva);
}
