package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.model.User;
//import com.thinkxfactor.zomatoplus.model.UserLogin;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepository.save(user);
		return persistedUser;
		}
/*	@GetMapping("/login")
	public String userLogin() {
		return "Hello from thinkxfactor";
	}*/
	
	@PostMapping("/create")
	public User userRegistation(@RequestBody User user) {
		
		System.out.println(user.toString());
		
		return user;
	}

	@PostMapping("/login")
	public User userLogin(@RequestParam String name,String password) {
		
		User usr = userRepository.findByNameAndPassword(name, password);
		
		return usr;
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		List<User> listofuser=userRepository.findAll();
		/*User usr1,usr2,usr3;
		usr1=new User("Snehasis","12345");
		usr2=new User("buBAN","3454");
		usr3=new User("kOLEY","546");
		usr.add(usr1);
		usr.add(usr2);
		usr.add(usr3);*/
		
		
		
		return listofuser;
	}
	

}



