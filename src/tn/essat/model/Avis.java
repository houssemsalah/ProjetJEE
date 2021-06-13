package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_avis;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	private String message;
	private int etat;
	public Avis(User user, String message, int etat) {
		super();
		this.user = user;
		this.message = message;
		this.etat = etat;
	}
	public Avis() {
		super();
	}
	public int getId_avis() {
		return id_avis;
	}
	public void setId_avis(int id_avis) {
		this.id_avis = id_avis;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Avis [id_avis=" + id_avis + ", user=" + user + ", message=" + message + ", etat=" + etat + "]";
	}
	
	

}
