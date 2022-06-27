package com.acme.riparazione.clienti;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Privato extends ClienteImp{
	@Column(unique = true)
	private String codiceFiscalePrivato;

	public Privato(long id, String nomeCliente, String citta, String indirizzo, List<Rapportino> rapportini,
			String codiceFiscalePrivato) {
		super(id, nomeCliente, citta, indirizzo, rapportini);
		this.codiceFiscalePrivato = codiceFiscalePrivato;
	}
	
	
}
