package com.acme.riparazione.tecnici;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.acme.riparazione.rapportini.Rapportino;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tecnici")
public class Tecnico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeTecnico;
	private String cognomeTecnico;
	@Column(unique = true)
	private String codiceFiscaleTecnico;
	
	@JsonIgnoreProperties({"tecnico"})
	@OneToMany(mappedBy = "tecnico")
	private List<Rapportino> rapportini = new ArrayList<Rapportino>();
}
