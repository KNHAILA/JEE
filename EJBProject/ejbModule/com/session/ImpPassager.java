package com.session;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.Avion;
import com.entities.Passager;

/**
 * Session Bean implementation class ImpPassager
 */
@Stateless
@LocalBean
public class ImpPassager implements IRemote_Passager {

	@PersistenceContext(unitName = "UPPassager" )
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public ImpPassager() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addHoraire(Passager a) {
		em.persist(a);
	}

	@Override
	public void deleteHoraire(Passager a) {
		em.remove(a);
	}

	@Override
	public void updateHoraire(Passager a) {
		em.merge(a);
		
	}

	@Override
	public Passager getPassager(int numeroP) {
		Passager a=em.find(Passager.class, numeroP);
		return a;
	}

	@Override
	public List<Passager> getAllPassagers() {
		Query q = em.createQuery("from Passager");
		return q.getResultList();
	}

}
