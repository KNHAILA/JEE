package com.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_HORAIRE")
public class Horaire implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Numero_Horaire" )
	private int NumeroH;
	@Column(name="Ville_Depart")
	private String villeDepart;
	@Column(name = "Ville_Arrivee")
	private String villeArrivée;
	@Temporal(TemporalType.TIME)
	@Column(name = "Heure_Depart")
	private Date heureDépart;
	@Temporal(TemporalType.TIME)
	@Column(name = "Heure_Arrivee")
	private Date heureArrivee;
	@OneToMany(mappedBy = "horaire")	
	private List<Vol> vols;
	
	
	public Horaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Horaire(int numeroH, String villeDepart, String villeArrivée, Date heureDépart, Date heureArrivee) {
		super();
		NumeroH = numeroH;
		this.villeDepart = villeDepart;
		this.villeArrivée = villeArrivée;
		this.heureDépart = heureDépart;
		this.heureArrivee = heureArrivee;
	}
	public int getNumeroH() {
		return NumeroH;
	}
	public void setNumeroH(int numeroH) {
		NumeroH = numeroH;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}
	public String getVilleArrivée() {
		return villeArrivée;
	}
	public void setVilleArrivée(String villeArrivée) {
		this.villeArrivée = villeArrivée;
	}
	public Date getHeureDépart() {
		return heureDépart;
	}
	public void setHeureDépart(Date heureDépart) {
		this.heureDépart = heureDépart;
	}
	public Date getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	public List<Vol> getVols() {
		return vols;
	}
	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}
}


