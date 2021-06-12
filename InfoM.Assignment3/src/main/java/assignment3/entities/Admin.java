
package assignment3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Author Elif

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminid;

	private String name;
	private String birthdate;
	private String location;

	@ManyToOne
	@JoinColumn(name = "appid", referencedColumnName = "id")
	private Steuerapp steuerapp;

	public Admin(String name, String birthdate, String location, Steuerapp steuerapp) {
		this.name = name;
		this.birthdate = birthdate;
		this.location = location;
		this.steuerapp = steuerapp;
	}

	public Admin() {

	}

	public long getAdminId() {
		return this.adminid;
	}

	public String getName() {
		return this.name;
	}

	public String getBirthdate() {
		return this.birthdate;

	}

	public String getLocation() {
		return this.location;
	}

	public Steuerapp getSteuerapp() {
		return steuerapp;
	}

}
