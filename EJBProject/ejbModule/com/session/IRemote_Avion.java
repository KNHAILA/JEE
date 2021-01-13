package com.session;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Avion;

@Remote
public interface IRemote_Avion {
	public void addAvion(Avion a);
	public void deleteAvion(Avion a);
	public void updateAvion(Avion a);
	public Avion getAvion(int numeroA);
	public List<Avion> getAllAvions();
}
