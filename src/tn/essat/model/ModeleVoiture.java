package tn.essat.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModeleVoiture {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int id_modele ;
private String titre;
private String climatisation ;
private int nbre_places;
private String coffre;
private String boite;
private int prix;
public ModeleVoiture(String titre, String climatisation, int nbre_places, String coffre, String boite, int prix) {
	super();
	this.titre = titre;
	this.climatisation = climatisation;
	this.nbre_places = nbre_places;
	this.coffre = coffre;
	this.boite = boite;
	this.prix = prix;
}
public ModeleVoiture() {
	super();
}
public int getId_modele() {
	return id_modele;
}
public void setId_modele(int id_modele) {
	this.id_modele = id_modele;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getClimatisation() {
	return climatisation;
}
public void setClimatisation(String climatisation) {
	this.climatisation = climatisation;
}
public int getNbre_places() {
	return nbre_places;
}
public void setNbre_places(int nbre_places) {
	this.nbre_places = nbre_places;
}
public String getCoffre() {
	return coffre;
}
public void setCoffre(String coffre) {
	this.coffre = coffre;
}
public String getBoite() {
	return boite;
}
public void setBoite(String boite) {
	this.boite = boite;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
@Override
public String toString() {
	return "ModeleVoiture [id_modele=" + id_modele + ", titre=" + titre + ", climatisation=" + climatisation
			+ ", nbre_places=" + nbre_places + ", coffre=" + coffre + ", boite=" + boite + ", prix=" + prix + "]";
}




}
