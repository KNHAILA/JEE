package com.session;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.entities.Vol;
import com.service.VolSessionLocal;
@Stateless
@LocalBean
public class ImpVol implements IRemote_Vol, VolSessionLocal {

	@PersistenceContext(unitName = "UPAvion" )
	private EntityManager em;
    public ImpVol() {
    }
	@Override
	public void addVol(Vol a) {
		em.persist(a);
	}
	@Override
	public void deleteVol(Vol a) {
		em.remove(a);
	}
	@Override
	public void updateVol(Vol a) {
		em.merge(a);
	}
	@Override
	public Vol getVol(int numeroV) {
		Vol a=em.find(Vol.class, numeroV);
		return a;
	}
	@Override
	public List<Vol> getAllVols() {
		Query q = em.createQuery("from Vol");
		return q.getResultList();
	}
}

