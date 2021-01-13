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
	private String villeArriv�e;
	@Temporal(TemporalType.TIME)
	@Column(name = "Heure_Depart")
	private Date heureD�part;
	@Temporal(TemporalType.TIME)
	@Column(name = "Heure_Arrivee")
	private Date heureArrivee;
	@OneToMany(mappedBy = "horaire")	
	private List<Vol> vols;
	
	
	public Horaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Horaire(int numeroH, String villeDepart, String villeArriv�e, Date heureD�part, Date heureArrivee) {
		super();
		NumeroH = numeroH;
		this.villeDepart = villeDepart;
		this.villeArriv�e = villeArriv�e;
		this.heureD�part = heureD�part;
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
	public String getVilleArriv�e() {
		return villeArriv�e;
	}
	public void setVilleArriv�e(String villeArriv�e) {
		this.villeArriv�e = villeArriv�e;
	}
	public Date getHeureD�part() {
		return heureD�part;
	}
	public void setHeureD�part(Date heureD�part) {
		this.heureD�part = heureD�part;
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


