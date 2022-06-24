package com.acme.riparazione.interventi;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sostituzioni")
public class Sostituzione extends InterventoAbstract {
	
	private int numeroDiPezzi;

}
