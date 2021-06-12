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

}
