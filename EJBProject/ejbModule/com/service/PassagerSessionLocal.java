package com.service;

import java.util.List;
import javax.ejb.Local;
import com.entities.Passager;

@Local
public interface PassagerSessionLocal {
	public void addHoraire(Passager a);
	public void deleteHoraire(Passager a);
	public void updateHoraire(Passager a);
	public Passager getPassager(int numeroP);
	public List<Passager> getAllPassagers();

}
