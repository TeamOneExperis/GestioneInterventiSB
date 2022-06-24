package com.acme.riparazione.interventi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.acme.riparazione.clienti.Cliente;
import com.acme.riparazione.rapportini.Rapportino;
import com.acme.riparazione.tecnici.Tecnico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class InterventoAbstract implements Intervento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long interventoId;
	private String descrizione;
	private double prezzo;
	
	@ManyToOne
	private Rapportino rapportinoId;
	
	

}
