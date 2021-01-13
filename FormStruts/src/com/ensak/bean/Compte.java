package com.ensak.bean;

public class Compte {
	private String nom;
	private String prenom;
	private String courriel;
	private String password;
	

	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String nom, String prenom, String courriel, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCourriel() {
		return courriel;
	}
	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String CreerCompte() {
		return "success";
	}
	
}
