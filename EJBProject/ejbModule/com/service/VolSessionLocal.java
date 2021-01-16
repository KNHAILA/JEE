package com.service;

import java.util.List;

import javax.ejb.Local;

import com.entities.Vol;
@Local
public interface VolSessionLocal {
	public void addVol(Vol a);
	public void deleteVol(Vol a);
	public void updateVol(Vol a);
	public Vol getVol(int numeroV);
	public List<Vol> getAllVols();

}
