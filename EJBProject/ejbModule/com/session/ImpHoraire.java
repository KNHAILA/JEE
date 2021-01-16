package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.entities.Horaire;
import com.service.AvionSessionLocal;
import com.service.HoraireSessionLocal;
@Stateless
@LocalBean
public class ImpHoraire implements IRemote_Horaire , HoraireSessionLocal{

	@PersistenceContext(unitName = "UPAvion" )
	private EntityManager em;
    public ImpHoraire() {
    }
	@Override
	public void addHoraire(Horaire a) {
		em.persist(a);
	}
	@Override
	public void deleteHoraire(Horaire a) {
		Horaire h = em.find(Horaire.class, a.getNumeroH());
		em.remove(h);
	}
	@Override
	public void updateHoraire(Horaire a) {
		em.merge(a);
	}
	@Override
	public Horaire getHoraire(int numeroH) {
		Horaire a=em.find(Horaire.class, numeroH);
		return a;
	}
	@Override
	public List<Horaire> getAllHoraires() {
		Query q = em.createQuery("from Horaire");
		return q.getResultList();
	}
}


