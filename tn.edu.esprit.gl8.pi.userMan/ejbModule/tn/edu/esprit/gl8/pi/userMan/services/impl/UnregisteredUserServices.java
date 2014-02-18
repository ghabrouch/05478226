package tn.edu.esprit.gl8.pi.userMan.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.pi.userMan.domain.UnregisteredUser;
import tn.edu.esprit.gl8.pi.userMan.services.interfaces.UnregisteredUserServicesLocal;
import tn.edu.esprit.gl8.pi.userMan.services.interfaces.UnregisteredUserServicesRemote;

/**
 * Session Bean implementation class UnregisteredUserServices
 */
@Stateless
public class UnregisteredUserServices implements
		UnregisteredUserServicesRemote, UnregisteredUserServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UnregisteredUserServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createAccount(UnregisteredUser unregisteredUser) {
		entityManager.persist(unregisteredUser);
	}

}
