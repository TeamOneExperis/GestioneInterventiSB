<<<<<<< HEAD
package com.acme.riparazione.interventi;

import com.acme.riparazione.rapportini.Rapportino;

public interface Intervento {


	String getDescrizione();

	long getInterventoId();

	double getPrezzo();

	Rapportino getRapportinoId();

	void setDescrizione(String descrizione);

	void setInterventoId(long interventoId);

	void setPrezzo(double prezzo);

	void setRapportinoId(Rapportino rapportinoId);


}
=======
package com.acme.riparazione.interventi;

public interface Intervento {

}
>>>>>>> refs/heads/Francesco
