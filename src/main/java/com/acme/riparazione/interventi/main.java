package com.acme.riparazione.interventi;

import com.acme.riparazione.interventi.sostituzioni.Sostituzione;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Interfaccia con servizi generici
		Intervento intervento = Sostituzione.builder().numeroDiPezzi(20).build();
		
		System.out.println(intervento.toString());
		
		// Classe con servizi concreti
		Sostituzione intervento2 = Sostituzione.builder().numeroDiPezzi(30).build();
		
		System.out.println(intervento2.toString());
		
	}

}
