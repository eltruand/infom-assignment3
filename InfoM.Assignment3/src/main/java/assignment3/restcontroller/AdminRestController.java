package assignment3.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import assignment3.entities.Admin;
import assignment3.repositories.AdminRepository;

//@Author Elif

@RestController
@CrossOrigin
public class AdminRestController {
	@Autowired
	private AdminRepository repository;

	@RequestMapping(value = "assignment3/admins", method = RequestMethod.GET)
	public ResponseEntity<List<Admin>> getAdmins() {
		List<Admin> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Admin>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Admin>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "assignment3/admins/{id}", method = RequestMethod.GET)
	public ResponseEntity<Admin> getAdminById(@PathVariable("id") long id) {
		Optional<Admin> result = this.repository.findById(id);

		if (result.isPresent()) {
			return new ResponseEntity<Admin>(result.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}

}