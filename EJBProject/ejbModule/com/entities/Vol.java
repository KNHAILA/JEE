package com.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_VOL")
public class Vol implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Numero_Vol")
	private int numeroV;
	@Column(name = "Jour_Sem")
	private int jourSem;
	@Column(name = "Jour")
	private int jour;
	@Column(name = "Places_Libres")
	private int placesLibres;
	@ManyToOne
	@JoinColumn(name = "Id_Avion")
	private Avion avion;
	@ManyToOne
	@JoinColumn(name = "Id_Horaire")
	private Horaire horaire;
	@ManyToMany
	@JoinTable(name="RESERVE",
	joinColumns = @JoinColumn(name="Id_Vol"),
	inverseJoinColumns = @JoinColumn(name="Id_Passager")) 
	private List<Passager> passagers;
	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vol(int numeroV, int jourSem, int jour, int placesLibres) {
		super();
		this.numeroV = numeroV;
		this.jourSem = jourSem;
		this.jour = jour;
		this.placesLibres = placesLibres;
	}
	
	public int getNumeroV() {
		return numeroV;
	}
	public void setNumeroV(int numeroV) {
		this.numeroV = numeroV;
	}
	public int getJourSem() {
		return jourSem;
	}
	public void setJourSem(int jourSem) {
		this.jourSem = jourSem;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getPlacesLibres() {
		return placesLibres;
	}
	public void setPlacesLibres(int placesLibres) {
		this.placesLibres = placesLibres;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public Horaire getHoraire() {
		return horaire;
	}
	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}
	public List<Passager> getPassagers() {
		return passagers;
	}
	public void setPassagers(List<Passager> passagers) {
		this.passagers = passagers;
	}
	
	
}


