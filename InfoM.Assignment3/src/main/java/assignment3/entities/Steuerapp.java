package assignment3.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Steuerapp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long appid;

	private long version;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private User user;

	@OneToOne(mappedBy = "adminteam")
	private Adminteam adminteam;

	@OneToMany(mappedBy = "steuererklärung", cascade = CascadeType.ALL)
	private Steuererklärung steuererklärung;

	public Steuerapp(long appid, long version, User user, Adminteam adminteam, Steuererklärung steuererklärung) {
		this.appid = appid;
		this.version = version;
		this.user = user;
		this.adminteam = adminteam;
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

	public Adminteam getAdminteam() {
		return this.adminteam;
	}

	public Steuererklärung getSteuererklärung() {
		return this.steuererklärung;
	}

}
