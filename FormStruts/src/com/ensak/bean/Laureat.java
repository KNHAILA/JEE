package com.ensak.bean;

public class Laureat {
	private String nom;
	private String prenom;
	private String tel;
	private String adr;
	private String pays;
	private String ville;
	private String entreprise;
	private String fonction;
	private String email;
	private int age;
	private String contact;
	
	
	public Laureat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Laureat(String nom, String prenom, String tel, String adr, String pays, String ville, String entreprise,
			String fonction, String email, int age, String contact) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adr = adr;
		this.pays = pays;
		this.ville = ville;
		this.entreprise = entreprise;
		this.fonction = fonction;
		this.email = email;
		this.age = age;
		this.contact = contact;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String ValiderLaureat()
	{
		return "success";
	}
}
