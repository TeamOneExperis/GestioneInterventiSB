package com.acme.riparazione.interventi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
public class Verifica extends InterventoImp {
	private int anno;
}
