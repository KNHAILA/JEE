package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_PASSAGER")
public class Passager implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Numero_Passager")
	private int numeroP;
	@Column(name = "Nom_Passager")
	private String nom;
	@Column(name = "Prenom_Passager")
	private String prenom;
	@ManyToMany(mappedBy = "passagers")
	private List<Vol> vols;
	
	
	
	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Passager(int numeroP, String nom, String prenom) {
		super();
		this.numeroP = numeroP;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getNumeroP() {
		return numeroP;
	}
	public void setNumeroP(int numeroP) {
		this.numeroP = numeroP;
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
	public List<Vol> getVols() {
		return vols;
	}
	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}
}
