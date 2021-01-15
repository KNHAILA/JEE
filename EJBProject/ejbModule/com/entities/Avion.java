package com.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="T_AVION")
public class Avion implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Numero_Avion")
	private int NumeroA;
	@Column(name = "Compagnie")
	private String compagnie;
	@Column(name = "Constructeur")
	private String constructeur;
	@Column(name = "Modele")
	private String modele;
	@Column(name = "Capacite")
	private int capacite;
	@OneToMany(mappedBy = "avion")
	private List<Vol> vols;
	
	
	
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Avion(int numeroA, String compagnie, String constructeur, String modele, int capacite) {
		super();
		NumeroA = numeroA;
		this.compagnie = compagnie;
		this.constructeur = constructeur;
		this.modele = modele;
		this.capacite = capacite;
	}
	
	public int getNumeroA() {
		return NumeroA;
	}
	public void setNumeroA(int numeroA) {
		this.NumeroA = numeroA;
	}
	public String getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}
	public String getConstructeur() {
		return constructeur;
	}
	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public List<Vol> getVols() {
		return vols;
	}
	public void setVols(List<Vol> vols) {
		this.vols = vols;
	} 
	
	
}



 