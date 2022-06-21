package com.acme.riparazione.interventi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "interventi")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class InterventoImp implements Intervento{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
}
