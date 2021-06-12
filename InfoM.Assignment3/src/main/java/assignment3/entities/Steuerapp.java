package assignment3.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//@Author Dominic

@Entity
public class Steuerapp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long appid;

	private long version;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private User user;

	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	private Admin admin;

	@OneToMany(mappedBy = "steuererklärung", cascade = CascadeType.ALL)
	private Steuererklärung steuererklärung;

	public Steuerapp(long appid, long version, User user, Admin admin, Steuererklärung steuererklärung) {
		this.appid = appid;
		this.version = version;
		this.user = user;
		this.admin = admin;
		this.steuererklärung = steuererklärung;
	}

	public Steuerapp() {

	}

	public long getAppid() {
		return this.appid;
	}

	public long getVersion() {
		return this.version;
	}

	public User getUser() {
		return this.user;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public Steuererklärung getSteuererklärung() {
		return this.steuererklärung;
	}

}
