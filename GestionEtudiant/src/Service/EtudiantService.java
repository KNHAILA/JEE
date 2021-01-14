package Service;

import java.util.List;

import DAO.Etudiant;

public interface EtudiantService {
	public void addEtudiant(Etudiant E);
	public void deleteEtudiant(Long code);
	public void updateEtudiant(Etudiant E);
	public Etudiant getEtudiantByCode(Long code);
	public List<Etudiant> getAllEtudiants();

}

