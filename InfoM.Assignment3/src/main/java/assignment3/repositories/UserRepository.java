package assignment3.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import assignment3.entities.User;

//@Author Ozan

public interface UserRepository extends JpaRepository <User, Long> {
	
@Query("SELECT u FROM User u WHERE u.age = ?1")
public List<User> findUserbyAge(int age);
}

