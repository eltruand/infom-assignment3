package assignment3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adminteam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	// brauch ich für OneToOne auf Steuerapp-Seite
	@OneToOne
	@JoinColumn(name = "appid", referencedColumnName="id")
	private Steuerapp steuerapp;

}
