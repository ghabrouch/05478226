package tn.edu.esprit.gl8.pi.userMan.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.pi.userMan.domain.User;
import tn.edu.esprit.gl8.pi.userMan.services.interfaces.UserServicesLocal;
import tn.edu.esprit.gl8.pi.userMan.services.interfaces.UserServicesRemote;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPersonalInformation(User user) {
		entityManager.persist(user);

	}

	@Override
	public User getUserById(int id) {
		User user = entityManager.find(User.class, id);
		return user;

	}

	@Override
	public void updatePersonalInformation(User user) {
		entityManager.merge(user);

	}

}
