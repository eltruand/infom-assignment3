package assignment3.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Infection;
import ch.zhaw.springboot.entities.Pathogen;
import ch.zhaw.springboot.entities.Person;
import ch.zhaw.springboot.models.InfectionRequest;

@RestController
@CrossOrigin
public class SteuerappRestController {
	
	@Autowired
	private SteuerappRepository repository;
	
	
	
	
}
