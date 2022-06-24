package com.acme.riparazione.rapportini;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.acme.riparazione.clienti.ClienteImp;
import com.acme.riparazione.interventi.InterventoImp;
import com.acme.riparazione.tecnici.Tecnico;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "rapportini")
@Entity
public class Rapportino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String data;
	private String numeroSeriale;
	
	
	
	@ManyToOne
	private ClienteImp cliente;
	
	@ManyToOne
	private Tecnico tecnico;
	
	@OneToMany
	private List<InterventoImp> interventi;
	
	
}