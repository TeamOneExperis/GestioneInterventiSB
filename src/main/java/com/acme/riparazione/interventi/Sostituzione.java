package com.acme.riparazione.interventi;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sostituzioni")
public class Sostituzione extends InterventoAbstract {

	private int numeroDiPezzi;

	@Builder
	public Sostituzione(long interventoId, String descrizione, double prezzo, Rapportino rapportinoId,
			int numeroDiPezzi) {
		super(interventoId, descrizione, prezzo, rapportinoId);
		this.numeroDiPezzi = numeroDiPezzi;
	}
	
	

}
