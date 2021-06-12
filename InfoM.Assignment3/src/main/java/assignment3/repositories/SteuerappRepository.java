package assignment3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import assignment3.entities.Steuerapp;
import assignment3.entities.User;

public interface SteuerappRepository extends JpaRepository<Steuerapp, Long> {

	@Query("SELECT u FROM User u, Steuererklärung se, Steuerapp sa WHERE u.id=sa.person AND sa.steuererklärung = se.id AND u.id = ?1 AND se.erstelldatum = ?2")
	public List<User> getUsersBySteuererklärungByErstelldatum(long steuererklärungid, int erstelldatum);

}
