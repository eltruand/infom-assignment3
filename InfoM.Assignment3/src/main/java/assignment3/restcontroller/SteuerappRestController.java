package assignment3.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import assignment3.entities.User;
import assignment3.repositories.SteuerappRepository;

//@Author Dominic

@RestController
@CrossOrigin
public class SteuerappRestController {

	@Autowired
	private SteuerappRepository repository;

	@RequestMapping(value = "assignment3/users/{steuerid}/{erstelldatum}", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsersBySteuererklärungByErstelldatum(
			@PathVariable("steuererid") long steuererklärungid, @PathVariable("erstelldatum") int erstelldatum) {
		List<User> result = this.repository.getUsersBySteuererklärungByErstelldatum(steuererklärungid, erstelldatum);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<User>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
	}

}
