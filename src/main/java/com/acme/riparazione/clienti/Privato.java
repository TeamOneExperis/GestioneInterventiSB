package com.acme.riparazione.clienti;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Privato extends ClienteImp{
	@Column(unique = true)
	private String codiceFiscale;

	public Privato(long id, String nomeCliente, String citta, String indirizzo, List<Rapportino> rapportini,
			String codiceFiscale) {
		super(id, nomeCliente, citta, indirizzo, rapportini);
		this.codiceFiscale = codiceFiscale;
	}
	
	
}
