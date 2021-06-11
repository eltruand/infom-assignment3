package assignment3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Steuerapp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long appid;

	private long erstellungsdatum;

	@OneToMany
	private User user;

	@OneToMany
	private Adminteam adminteam;

	@OneToMany
	private Steuererklärung steuererklärung;

	public Steuerapp(long appid, long erstellungsdatum, User user, Adminteam adminteam,
			Steuererklärung steuererklärung) {
		this.appid = appid;
		this.erstellungsdatum = erstellungsdatum;
		this.user = user;
		this.adminteam = adminteam;
		this.steuererklärung = steuererklärung;
	}

	public Steuerapp() {
		
	}

	public long getAppid() {
		return this.appid;
	}

	public long getErstellungsdatum() {
		return this.erstellungsdatum;
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
