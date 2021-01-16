package com.service;

import java.util.List;

import javax.ejb.Local;

import com.entities.Horaire;

@Local
public interface HoraireSessionLocal {
	public void addHoraire(Horaire a);
	public void deleteHoraire(Horaire a);
	public void updateHoraire(Horaire a);
	public Horaire getHoraire(int numeroH);
	public List<Horaire> getAllHoraires();

}
