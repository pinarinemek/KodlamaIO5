package entity.concretes;

import entity.abstracts.UserService;

public class User implements UserService{
	private int id;
	private String firtsName;
	private String lastName;
	private String password;
	private String eMail;
	
	
	public User() {
		
	}

	public User(int id, String firtsName, String lastName, String password , String eMail) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.password = password;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
}
