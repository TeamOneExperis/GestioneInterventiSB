package com.acme.riparazione.tecnici;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TecnicoRepository extends PagingAndSortingRepository<Tecnico, Long> {
	public boolean existsByCodiceFiscaleTecnico(String codiceFiscale);
	public Tecnico findByCodiceFiscaleTecnico(String codiceFiscale);
}
