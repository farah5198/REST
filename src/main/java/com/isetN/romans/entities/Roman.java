package com.isetN.romans.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Roman {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idRoman;
private String titreRoman;
private Double prixRoman;
private Date anneeEdition;
@ManyToOne
private Genre genre;

public Roman() {
super();
}

public Roman(String titreRoman, Double prixRoman, Date anneeEdition) {
	super();
	
	this.titreRoman = titreRoman;
	this.prixRoman = prixRoman;
	this.anneeEdition = anneeEdition;
}
public Long getIdRoman() {
	return idRoman;
}
public void setIdRoman(Long idRoman) {
	this.idRoman = idRoman;
}
public String getTitreRoman() {
	return titreRoman;
}
public void setTitreRoman(String titreRoman) {
	this.titreRoman = titreRoman;
}
public Double getPrixRoman() {
	return prixRoman;
}
public void setPrixRoman(Double prixRoman) {
	this.prixRoman = prixRoman;
}
public Date getAnneeEdition() {
	return anneeEdition;
}
public void setAnneeEdition(Date anneeEdition) {
	this.anneeEdition = anneeEdition;
}
@Override
public String toString() {
	return "Roman [idRoman=" + idRoman + ", titreRoman=" + titreRoman + ", prixRoman=" + prixRoman + ", anneeEdition="
			+ anneeEdition + "]";
}


}