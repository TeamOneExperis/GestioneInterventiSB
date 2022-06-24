package com.acme.riparazione.interventi.riparazioni;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.acme.riparazione.interventi.InterventoAbstract;
import com.acme.riparazione.rapportini.Rapportino;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name = "riparazione")
public class Riparazione extends InterventoAbstract {
	
	@Builder
	public Riparazione(long interventoId, String descrizione, double prezzo, Rapportino rapportinoId) {
		super(interventoId, descrizione, prezzo, rapportinoId);
		// TODO Auto-generated constructor stub
	}
	
	

}
