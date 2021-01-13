package com.session;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Vol;


@Remote
public interface IRemote_Vol {
	public void addVol(Vol a);
	public void deleteVol(Vol a);
	public void updateVol(Vol a);
	public Vol getVol(int numeroV);
	public List<Vol> getAllVols();

}
