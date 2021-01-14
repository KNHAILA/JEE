package Service;

import java.util.List;

import DAO.Etudiant;
import DAO.EtudiantDao;

public class ImpEtudiantService implements EtudiantService {                                                                               
	private EtudiantDao dao;
	public EtudiantDao getDao() {
		return dao;
	}
	public void setDao(EtudiantDao dao) {
		this.dao = dao;
	}
	@Override
	public void addEtudiant(Etudiant E) {
		dao.addEtudiant(E);
	}
	@Override
	public void deleteEtudiant(Long code) {
		dao.deleteEtudiant(code);
	}
	@Override
	public void updateEtudiant(Etudiant E) {
		dao.updateEtudiant(E);
	}
	@Override
	public Etudiant getEtudiantByCode(Long code) {
		return dao.getEtudiantByCode(code);
	}
	@Override
	public List<Etudiant> getAllEtudiants() {
		return dao.getAllEtudiants();
	}
}
