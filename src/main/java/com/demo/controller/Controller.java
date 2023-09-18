package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class Controller {
	@Autowired
	private UserService userservice;

	// list of users
	@GetMapping("/")
	public List<User> getallUsers() { // in order to get list user by REST api need to create getalluser method
		return this.userservice.getallUsers();// this line tell to get list of user which is in Userservice class we
												// need to do constructor injection and Autowired then only we can able
												// to return getallusers method of Userservice.

	}

	@GetMapping("/{name}")
	public User getsingleUser(@PathVariable("name") String name) {
		return this.userservice.getsingleUser(name);

	}

	@PostMapping("/") // we cannot take user information in URl so we need to add RequestBody
						// Annotation in method parameter.
	public User addUser(@RequestBody User usser) {
		return this.userservice.addUser(usser);

	 }

}
