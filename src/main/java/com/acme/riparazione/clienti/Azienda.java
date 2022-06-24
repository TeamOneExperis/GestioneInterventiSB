package com.acme.riparazione.clienti;

import java.util.List;

import javax.persistence.Entity;

import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Azienda extends ClienteImp{
	private String partitaIva;

	public Azienda(long id, String nomeCliente, String citta, String indirizzo, List<Rapportino> rapportini,
			String partitaIva) {
		super(id, nomeCliente, citta, indirizzo, rapportini);
		this.partitaIva = partitaIva;
	}
	
	
}
