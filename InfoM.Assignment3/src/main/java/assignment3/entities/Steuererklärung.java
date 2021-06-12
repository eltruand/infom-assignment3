package assignment3.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Steuererklärung {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long steuererklärungid;

	private int erstelldatum;
	private String kanton;
	private int einkommen;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "appid", referencedColumnName = "id")
	private Steuerapp steuerapp;

	public Steuererklärung() {

	}

	public Steuererklärung(int erstelldatum, String kanton, int einkommen) {
		this.erstelldatum = erstelldatum;
		this.kanton = kanton;
		this.einkommen = einkommen;
	}

	public long getSteuererklärungid() {
		return this.steuererklärungid;
	}

	public int getErstelldatum() {
		return erstelldatum;
	}

	public String getKanton() {
		return kanton;
	}

	public int getEinkommen() {
		return einkommen;
	}

}
