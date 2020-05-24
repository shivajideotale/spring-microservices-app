package app.guest.service.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import app.common.exception.FieldException;
import app.common.model.User;

@RestController
@RequestMapping("/u ser")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class UserController {

	@GetMapping
	public List<User> users() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setFirstName("Shivaji");
		user.setLastName("Deotale");
		users.add(user);
		System.out.println("inside user all");
		return users;
	}

	@PostMapping
	public User addUser(@Valid User user, BindingResult bindingResult) throws FieldException {
		if (bindingResult.hasErrors()) {
			throw new FieldException("FieldException FieldException ", bindingResult);
		}

		return user;
	}
}
