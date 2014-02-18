package tn.edu.esprit.gl8.pi.userMan.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.pi.userMan.domain.UnregisteredUser;

@Remote
public interface UnregisteredUserServicesRemote {
	public void createAccount(UnregisteredUser unregisteredUser);

}
