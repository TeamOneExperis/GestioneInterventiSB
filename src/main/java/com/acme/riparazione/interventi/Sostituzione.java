package com.acme.riparazione.interventi;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sostituzione extends InterventoAbstract {
	
	private int numeroDiPezzi;

}
