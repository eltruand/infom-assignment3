package assignment3.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import assignment3.entities.Steuererklärung;
import assignment3.repositories.SteuererklärungRepository;

@RestController
@CrossOrigin
public class SteuererklärungRestController {

	@Autowired
	private SteuererklärungRepository repository;

	@RequestMapping(value = "steuerapp/steuererklärung", method = RequestMethod.GET)
	public ResponseEntity<List<Steuererklärung>> getSteuererklärung() {
		List<Steuererklärung> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Steuererklärung>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Steuererklärung>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "steuererapp/steuererklärung", method = RequestMethod.POST)
	public ResponseEntity<Steuererklärung> createSteuererklärung(@RequestBody Steuererklärung steuererklärung) {
		Steuererklärung result = this.repository.save(steuererklärung);
		return new ResponseEntity<Steuererklärung>(result, HttpStatus.OK);
	}
}
