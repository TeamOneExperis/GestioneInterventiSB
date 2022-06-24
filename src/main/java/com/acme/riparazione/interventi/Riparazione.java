package com.acme.riparazione.interventi;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name = "riparazione")
public class Riparazione extends InterventoAbstract {

}
