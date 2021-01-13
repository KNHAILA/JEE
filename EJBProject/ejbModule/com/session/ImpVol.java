package com.session;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.Avion;
import com.entities.Vol;

/**
 * Session Bean implementation class ImpVol
 */
@Stateless
@LocalBean
public class ImpVol implements IRemote_Vol {

	@PersistenceContext(unitName = "UPVol" )
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ImpVol() {
        // TODO Auto-generated constructor stub
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
