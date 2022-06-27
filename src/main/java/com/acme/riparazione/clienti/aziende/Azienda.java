package com.acme.riparazione.clienti.aziende;

import java.util.List;

import javax.persistence.Column;
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
@Table(name = "aziende")
public class Azienda extends ClienteAbstract {
	@Column(unique = true)
	private String piva;

	public Azienda(long id, String nome, String cognome, String indirizzo, String citta, List<Rapportino> rapportini,
			String piva) {
		super(id, nome, cognome, indirizzo, citta, rapportini);
		this.piva = piva;
	}
	
	

}
