package com.acme.riparazione.rapportini;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RapportinoRepository extends PagingAndSortingRepository<Rapportino,Long> {

}
