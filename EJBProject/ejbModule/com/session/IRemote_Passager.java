package com.session;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Passager;


@Remote
public interface IRemote_Passager {
	public void addHoraire(Passager a);
	public void deleteHoraire(Passager a);
	public void updateHoraire(Passager a);
	public Passager getPassager(int numeroP);
	public List<Passager> getAllPassagers();

}
