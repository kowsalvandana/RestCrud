package com.user.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
public ResponseEntity<String> saveUser(@RequestBody User user){
	Integer userId=service.saveUser(user);
	String body="User Created"+userId;
	return ResponseEntity.ok(body);
}
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers(){
		List l=service.getAllUsers();
		return ResponseEntity.ok(l);
		
	}
	@GetMapping("/one/{userId}")
	public ResponseEntity<?> getOneuser(@PathVariable Integer userId){
		Optional<User> opt=service.getOneUser(userId);
		return ResponseEntity.ok(opt);
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
		service.deleteUser(userId);
       String body="User Deleted";
       return ResponseEntity.ok(body);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateUser(@RequestBody User user){
		service.updateUser(user);
		String body="User Update successfully";
		return ResponseEntity.ok(body);
	}
}
