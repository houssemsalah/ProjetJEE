package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private int iduser;
	private String nameuser;
	private String prenomuser;
	private String emailuser;
	private String passworduser;
	private String dateaccess;
	private String role;
	private int etatuser;
	public User(String nameuser, String prenomuser, String emailuser, String passworduser, String dateaccess,
			String role, int etatuser) {
		super();
		this.nameuser = nameuser;
		this.prenomuser = prenomuser;
		this.emailuser = emailuser;
		this.passworduser = passworduser;
		this.dateaccess = dateaccess;
		this.role = role;
		this.etatuser = etatuser;
	}
	public User() {
		super();
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getNameuser() {
		return nameuser;
	}
	public void setNameuser(String nameuser) {
		this.nameuser = nameuser;
	}
	public String getPrenomuser() {
		return prenomuser;
	}
	public void setPrenomuser(String prenomuser) {
		this.prenomuser = prenomuser;
	}
	public String getEmailuser() {
		return emailuser;
	}
	public void setEmailuser(String emailuser) {
		this.emailuser = emailuser;
	}
	public String getPassworduser() {
		return passworduser;
	}
	public void setPassworduser(String passworduser) {
		this.passworduser = passworduser;
	}
	public String getDateaccess() {
		return dateaccess;
	}
	public void setDateaccess(String dateaccess) {
		this.dateaccess = dateaccess;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getEtatuser() {
		return etatuser;
	}
	public void setEtatuser(int etatuser) {
		this.etatuser = etatuser;
	}
	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", nameuser=" + nameuser + ", prenomuser=" + prenomuser + ", emailuser="
				+ emailuser + ", passworduser=" + passworduser + ", dateaccess=" + dateaccess + ", role=" + role
				+ ", etatuser=" + etatuser + "]";
	}

	
}
