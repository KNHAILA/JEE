package com.session;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Passager;


@Remote
public interface IRemote_Passager {
	public void addPassager(Passager a);
	public void deletePassager(Passager a);
	public void updatePassager(Passager a);
	public Passager getPassager(int numeroP);
	public List<Passager> getAllPassagers();

}

