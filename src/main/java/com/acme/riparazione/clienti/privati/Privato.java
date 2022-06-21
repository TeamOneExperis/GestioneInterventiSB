package com.acme.riparazione.clienti.privati;

import javax.persistence.Table;

import com.acme.riparazione.clienti.ClienteAbstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "privati")
public class Privato extends ClienteAbstract {
	
	private String cF;

}
