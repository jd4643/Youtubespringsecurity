package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.User;

@Service
public class UserService {
	List<User> user = new ArrayList<>();

	public UserService() {
		user.add(new User("jawad", 101, "jay123@gmail.com"));
		user.add(new User("Mohammed", 102, "mohd123@gmail.com"));

	}

	// Method to get a list of all users
	public List<User> getallUsers() {
		return this.user;

	}

	 // Method to get a single user by name
	public User getsingleUser(String name) {
		return this.user.stream().filter((usser) -> usser.getName().equals(name)).findAny().orElse(null);

	}
	
	//adding user in the list
	//As normally we create method of a class for example sum method
	/*public int sum(int x) {here int means User, int x = User usser.
		return x;*/
		
	//Method to add a new user to the list
	public User addUser(User usser) {
		this.user.add(usser);
		return usser;
		
	}

}
