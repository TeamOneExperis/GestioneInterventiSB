package com.acme.riparazione.clienti;

import java.util.List;

import com.acme.riparazione.rapportini.Rapportino;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public interface Cliente {

	String getCitta();

	String getCognome();

	long getId();

	String getIndirizzo();

	String getNome();

	List<Rapportino> getRapportini();

	void setCitta(String citta);

	void setCognome(String cognome);

	void setId(long id);

	void setIndirizzo(String indirizzo);

	void setNome(String nome);

	void setRapportini(List<Rapportino> rapportini);

}