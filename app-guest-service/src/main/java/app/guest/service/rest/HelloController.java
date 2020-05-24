package app.guest.service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class HelloController {

	
	@GetMapping
	public String helloGuest() {
		return "welcome Guest";
	}
	
	
	@GetMapping("/{name}")
	public String helloUser(@PathVariable(name = "name") String name) {
		return "welcome "+name;
	}
}
