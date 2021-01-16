package com.service;

import java.util.List;

import javax.ejb.Local;

import com.entities.Avion;

@Local
public interface AvionSessionLocal {
	public void addAvion(Avion a);
	public void deleteAvion(Avion a);
	public void updateAvion(Avion a);
	public Avion getAvion(int numeroA);
	public List<Avion> getAllAvions();

}
