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
import com.thinkxfactor.zomatoplus.model.Resturent;
import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.ResturentRepository;
//import com.thinkxfactor.zomatoplus.model.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/resturent")

public class ResturentController {
	
	@Autowired
	private ResturentRepository resturentRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public Resturent addResturent(@RequestBody Resturent resturent) {
		Resturent persistedResturent=resturentRepository.save(resturent);
		return persistedResturent;
		}
	/*@PostMapping("/create")
	public Resturent CreateResturent(@RequestBody Resturent res) {
		System.out.println(res.toString());
		
		return res;
		
	}*/

	@GetMapping("/getall")
	public List<Resturent> getAll(){
		List<Resturent> listofResturent=resturentRepository.findAll();
				
		return listofResturent;
	}
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item item) {
		Item persistedItem=itemRepository.save(item);
		
		return persistedItem;
		
	}
	

}
