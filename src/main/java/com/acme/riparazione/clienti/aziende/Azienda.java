package com.acme.riparazione.clienti.aziende;

import javax.persistence.Table;

import com.acme.riparazione.clienti.ClienteAbstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aziende")
public class Azienda extends ClienteAbstract {
	
	private String pIva;

}
