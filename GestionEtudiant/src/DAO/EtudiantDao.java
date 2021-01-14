package DAO;

import java.util.List;

public interface EtudiantDao {
	public void addEtudiant(Etudiant E);
	public void deleteEtudiant(Long code);
	public void updateEtudiant(Etudiant E);
	public Etudiant getEtudiantByCode(Long code);
	public List<Etudiant> getAllEtudiants();
}

