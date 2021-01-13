package com.session;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Horaire;

@Remote
public interface IRemote_Horaire {
	public void addHoraire(Horaire a);
	public void deleteHoraire(Horaire a);
	public void updateHoraire(Horaire a);
	public Horaire getHoraire(int numeroH);
	public List<Horaire> getAllHoraires();

}
