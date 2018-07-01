package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.model.Item;
import com.thinkxfactor.zomatoplus.model.Restaurent;
//import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurentRepository;
//import com.thinkxfactor.zomatoplus.model.User;
//import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/restaurent")

public class RestaurentController {
	
	@Autowired
	private RestaurentRepository restaurentRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public Restaurent addrestaurant(@RequestBody Restaurent user) {
		
		Restaurent persistedUser=restaurentRepository.save(user);
		
		
		return persistedUser;
	}
	/*@PostMapping("/create")
	public Restaurent CreateResturent(@RequestBody Restaurent res) {
		System.out.println(res.toString());
		
		return res;
		
	}*/

	@GetMapping("/getAll")
	public List<Restaurent> getAll(){
		List<Restaurent> listofRestaurent=restaurentRepository.findAll();
				
		return listofRestaurent;
	}
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item item) {
		Item persistedItem=itemRepository.save(item);
		
		return persistedItem;
		
	}
	

}
