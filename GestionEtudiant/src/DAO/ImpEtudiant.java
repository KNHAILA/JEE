package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ImpEtudiant implements EtudiantDao {

	@Override
	public void addEtudiant(Etudiant E) {
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
		Transaction trans = session.beginTransaction();
		session.save(E);
		trans.commit(); 
	}

	@Override
	public void deleteEtudiant(Long code) {
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
		Transaction trans = session.beginTransaction();
		Etudiant etudiant=(Etudiant) session.load(Etudiant.class, code);
		session.delete(etudiant);
		trans.commit(); 

	}

	@Override
	public void updateEtudiant(Etudiant E) {
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
		Transaction trans = session.beginTransaction();
		session.save(E);
		trans.commit(); 
	}

	@Override
	public Etudiant getEtudiantByCode(Long code) {
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
		Etudiant etudiant=(Etudiant) session.load(Etudiant.class, code);
		return etudiant;
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		SessionFactory SF = new Configuration().configure().buildSessionFactory();
		Session session = SF.openSession();
		Query qr= session.createQuery("from Etudiant");
		return qr.list();
	}
	
	
	public void Initialiser() {
		System.out.println("Démarrage de notre application");
	}

}



