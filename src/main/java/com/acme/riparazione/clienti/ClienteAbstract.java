package com.acme.riparazione.clienti;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.acme.riparazione.rapportini.Rapportino;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clienti")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ClienteAbstract implements Cliente{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long   id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String citta;

	@ToString.Exclude
	@JsonIgnoreProperties({"cliente"})
	@OneToMany(mappedBy = "cliente")
	private List<Rapportino> rapportini;
}
