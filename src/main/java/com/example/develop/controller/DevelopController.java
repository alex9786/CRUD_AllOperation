package com.example.develop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.develop.entity.Develop;
import com.example.develop.service.DevelopServiceImp;

@RestController
@RequestMapping("/host")
public class DevelopController {
	
	@Autowired
	DevelopServiceImp DevelopImp;
	
	@PostMapping("/post")
	public Develop postDevelop(@RequestBody Develop develop) {
		return DevelopImp.postDevelop(develop);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Develop> get(@PathVariable ("id") int id){
		return DevelopImp.get(id);
	}
	
	@PutMapping("/change")
	public Develop update(@RequestBody Develop develop){
		return DevelopImp.update(develop);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")int id) {
		return DevelopImp.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<Develop> getAll(){
		return DevelopImp.getAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
