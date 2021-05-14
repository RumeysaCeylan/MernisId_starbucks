package Entities;
import java.util.Date;

import Abstract.IEntity;



public class Customer implements IEntity{
	private int id;
	private String FirstName;
	private String LastName;
	private Date dateOfBirth;
	private String NationalityId;
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	
}
