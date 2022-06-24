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
@Entity
@Table(name = "verifiche")
public class Verifica extends InterventoAbstract {

	@Builder
	public Verifica(long interventoId, String descrizione, double prezzo, Rapportino rapportinoId) {
		super(interventoId, descrizione, prezzo, rapportinoId);
		// TODO Auto-generated constructor stub
	}
	

}
