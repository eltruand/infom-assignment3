package assignment3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment3.entities.User;


public interface UserRepository extends JpaRepository <User, Long> //Long weil der Primary-Key bei der Entity User ein long ist.
{

}
