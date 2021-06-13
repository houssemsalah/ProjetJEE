package tn.essat.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Reservation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@ManyToOne
	@JoinColumn(name="voiture_id")
	private Voiture voiture;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	private String  ville_depart;
	private LocalDateTime date_debut;
	private LocalDateTime prix_jour;
	private int etat;
	public Reservation(Voiture voiture, User user, String ville_depart, LocalDateTime date_debut,
			LocalDateTime prix_jour, int etat) {
		super();
		this.voiture = voiture;
		this.user = user;
		this.ville_depart = ville_depart;
		this.date_debut = date_debut;
		this.prix_jour = prix_jour;
		this.etat = etat;
	}
	public Reservation() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getVille_depart() {
		return ville_depart;
	}
	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}
	public LocalDateTime getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(LocalDateTime date_debut) {
		this.date_debut = date_debut;
	}
	public LocalDateTime getPrix_jour() {
		return prix_jour;
	}
	public void setPrix_jour(LocalDateTime prix_jour) {
		this.prix_jour = prix_jour;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", voiture=" + voiture + ", user=" + user + ", ville_depart=" + ville_depart
				+ ", date_debut=" + date_debut + ", prix_jour=" + prix_jour + ", etat=" + etat + "]";
	}
	
	

}
