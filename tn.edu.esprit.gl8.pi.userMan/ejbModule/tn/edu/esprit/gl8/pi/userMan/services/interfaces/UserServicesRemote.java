package tn.edu.esprit.gl8.pi.userMan.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.pi.userMan.domain.User;

@Remote
public interface UserServicesRemote {
	public void addPersonalInformation(User user);
	public User getUserById(int id);
	public void updatePersonalInformation(User user);

}
