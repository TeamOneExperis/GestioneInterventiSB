package com.acme.riparazione.interventi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sostituzione extends InterventoImp {
	private int numeroPezzi;
}
