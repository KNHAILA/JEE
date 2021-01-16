package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.entities.Avion;
import com.service.AvionSessionLocal;
@Stateless
@LocalBean
public class ImpAvion implements IRemote_Avion, AvionSessionLocal {
	
	@PersistenceContext(unitName = "UPAvion" )
	private EntityManager em;
    public ImpAvion() {
    }
	@Override
	public void addAvion(Avion a) {
		em.persist(a);
	}
	@Override
	public void deleteAvion(Avion a) {
		Avion av = em.find(Avion.class, a.getNumeroA());
		em.remove(av);
	}
	@Override
	public void updateAvion(Avion a) {
		em.merge(a);
	}
	@Override
	public Avion getAvion(int numeroA) {
		Avion a=em.find(Avion.class, numeroA);
		return a;
	}
	@Override
	public List<Avion> getAllAvions() {
		Query q = em.createQuery("from Avion");		
		return q.getResultList();
	}
}

