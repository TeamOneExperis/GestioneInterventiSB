package com.acme.riparazione.clienti;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ClienteAbstract implements Citta{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String citta;

/*
 	private List<Rapportino> rapportino;
	
*/

}
