package com.service;

import java.util.List;
import javax.ejb.Local;
import com.entities.Passager;

@Local
public interface PassagerSessionLocal {
	public void addPassager(Passager a);
	public void deletePassager(Passager a);
	public void updatePassager(Passager a);
	public Passager getPassager(int numeroP);
	public List<Passager> getAllPassagers();

}

