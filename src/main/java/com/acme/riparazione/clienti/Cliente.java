package com.acme.riparazione.clienti;

public interface Cliente {

	String getCitta();

	String getCognome();

	long getId();

	String getIndirizzo();

	String getNome();

	void setCitta(String citta);

	void setCognome(String cognome);

	void setId(long id);

	void setIndirizzo(String indirizzo);

	void setNome(String nome);

}

