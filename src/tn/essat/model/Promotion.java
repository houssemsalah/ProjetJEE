package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Promotion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id_promo;
	@ManyToOne
	@JoinColumn(name="modele_id")
	private ModeleVoiture modele;
	private int pri;
	private int etat;
	public Promotion(ModeleVoiture modele, int pri, int etat) {
		super();
		this.modele = modele;
		this.pri = pri;
		this.etat = etat;
	}
	public Promotion() {
		super();
	}
	
	
	public int getId_promo() {
		return id_promo;
	}
	public void setId_promo(int id_promo) {
		this.id_promo = id_promo;
	}
	public ModeleVoiture getModele() {
		return modele;
	}
	public void setModele(ModeleVoiture modele) {
		this.modele = modele;
	}
	public int getPri() {
		return pri;
	}
	public void setPri(int pri) {
		this.pri = pri;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Promotion [id_promo=" + id_promo + ", modele=" + modele + ", pri=" + pri + ", etat=" + etat + "]";
	}

		
}
