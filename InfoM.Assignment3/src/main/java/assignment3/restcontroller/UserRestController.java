package assignment3.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import assignment3.entities.User;
import assignment3.repositories.UserRepository;

@RestController
@CrossOrigin
public class UserRestController {

	@Autowired
	private UserRepository repository;

	@RequestMapping(value = "assignment3/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
		List<User> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<User>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "assignment3/users/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> getUsersById(@PathVariable("id") long id) {
		Optional<User> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<User>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "assignment3/users/byAge/{age}", method = RequestMethod.GET)
	public ResponseEntity<List<User>> findUserByAge(@PathVariable("age") int age) {
		List<User> result = this.repository.findUserbyAge(age);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<User>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "assignment3/users", method = RequestMethod.POST)
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User result = this.repository.save(user);
		return new ResponseEntity<User>(result, HttpStatus.OK);
	}

}
