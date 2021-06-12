package assignment3.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "appid", referencedColumnName = "id")
	private Steuerapp steuerapp;

	private String name;
	private String address;
	private int age;
	private String birthdate;

	public User(String name, String address, int age, String birthdate) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.birthdate = birthdate;
	}
	
	public User() {
		
	}

	public long getUserid() {
		return this.userid;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	public String getBirthdate() {
		return this.birthdate;
	}

}
