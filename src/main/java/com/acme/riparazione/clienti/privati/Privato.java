package com.acme.riparazione.clienti.privati;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.riparazione.clienti.ClienteAbstract;
import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "privati")
public class Privato extends ClienteAbstract {
	
	private String cf;

	public Privato(long id, String nome, String cognome, String indirizzo, String citta, List<Rapportino> rapportini,
			String cf) {
		super(id, nome, cognome, indirizzo, citta, rapportini);
		this.cf = cf;
	}

	
}
