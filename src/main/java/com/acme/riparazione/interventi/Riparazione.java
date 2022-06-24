package com.acme.riparazione.interventi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Riparazione extends InterventoImp {
	private boolean successoRiparazione;
}
