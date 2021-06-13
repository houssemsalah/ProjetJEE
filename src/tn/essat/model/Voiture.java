package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_voiture;
	@ManyToOne
	@JoinColumn(name="modele_id")
	private ModeleVoiture modele;
	private String matricule;
	private int annee;
	private String couleur;
	private int etat;
	public Voiture(ModeleVoiture modele, String matricule, int annee, String couleur, int etat) {
		super();
		this.modele = modele;
		this.matricule = matricule;
		this.annee = annee;
		this.couleur = couleur;
		this.etat = etat;
	}
	public Voiture() {
		super();
	}
	public int getId_voiture() {
		return id_voiture;
	}
	public void setId_voiture(int id_voiture) {
		this.id_voiture = id_voiture;
	}
	public ModeleVoiture getModele() {
		return modele;
	}
	public void setModele(ModeleVoiture modele) {
		this.modele = modele;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Voiture [id_voiture=" + id_voiture + ", modele=" + modele + ", matricule=" + matricule + ", annee="
				+ annee + ", couleur=" + couleur + ", etat=" + etat + "]";
	}
	
	
	
}
