package assignment3.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import assignment3.repositories.AdminRepository;
import assignment3.repositories.SteuerappRepository;
import assignment3.repositories.SteuererklärungRepository;
import assignment3.repositories.UserRepository;

@RestController
@CrossOrigin
public class SteuerappRestController {

	@Autowired
	private SteuerappRepository repository;

	@Autowired
	private SteuererklärungRepository steuererklärungrepository;

	@Autowired
	private UserRepository userrepository;

	@Autowired
	private AdminRepository adminrepository;

}
