package com.tts.UserAPI1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tts.UserAPI1.Model.User;
import com.tts.UserAPI1.Repository.UserRepository;


@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	
//	
//	@GetMapping( value="/user")
//	public List<User> getUser(){
//	return (List<User>) userRepository.findAll();
//	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable(value="id") Long id){
	return userRepository.findById(id);
	}

	
	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable(value="id") Long id, @RequestBody User user){
	userRepository.save(user);
	}

	@PostMapping("/user")
	public void createUser(@RequestBody User user){
		userRepository.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable(value="id") Long id){
	userRepository.deleteById(id);
	}
	
	
	
	
	@GetMapping("/user")
	public List<User> getUsers(@RequestParam(value="state", required=false) String state){
	if (state != null) {
	return (List<User>) userRepository.findByState(state);
	}
	return (List<User>) userRepository.findAll();
	}

//	@GetMapping("/user")
//	public List<User> getUser(){
//	
//	return (List<User>) userRepository.findAll();
//	}
//	
//	@GetMapping("/userstate")
//	public List<User> getUserByState( String state)
//	{
//	return  (List<User>) userRepository.findByState(state);
//	
//}
}
