package tn.edu.esprit.gl8.pi.userMan.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	public User(String firstName, String lastName, int age, String addess) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.addess = addess;
	}

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String addess;
	private static final long serialVersionUID = 1L;

	public User() {
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
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getAddess() {
		return this.addess;
	}

	public void setAddess(String addess) {
		this.addess = addess;
	}
   
}
