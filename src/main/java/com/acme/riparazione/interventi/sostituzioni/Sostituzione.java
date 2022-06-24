package com.acme.riparazione.interventi.sostituzioni;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.riparazione.interventi.InterventoAbstract;
import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
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
