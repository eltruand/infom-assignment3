package assignment3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment3.entities.Steuererklärung;

public interface SteuererklärungRepository extends JpaRepository <Steuererklärung, Long>{

}
