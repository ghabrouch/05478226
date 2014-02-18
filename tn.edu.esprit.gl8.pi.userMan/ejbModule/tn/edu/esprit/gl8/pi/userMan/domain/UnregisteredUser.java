package tn.edu.esprit.gl8.pi.userMan.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UnregisteredUser
 *
 */
@Entity

public class UnregisteredUser implements Serializable {

	
	private int id;
	private String login;
	private String password;
	private String eMail;
	private static final long serialVersionUID = 1L;

	public UnregisteredUser() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getLogin() {
		return this.login;
	}

	public UnregisteredUser(String login, String password, String eMail) {
		super();
		this.login = login;
		this.password = password;
		this.eMail = eMail;
	}
	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
   
}
