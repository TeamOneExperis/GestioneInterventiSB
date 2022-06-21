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

@Entity
@Table(name = "clienti")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ClienteImp implements Cliente{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@OneToMany(mappedBy = "cliente")
	private List<Rapportino> rapportini;
	
}
