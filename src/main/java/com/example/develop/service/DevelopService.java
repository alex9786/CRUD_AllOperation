package com.example.develop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.develop.entity.Develop;
import com.example.develop.repository.DevelopRepository;

@Service
public class DevelopService implements DevelopServiceImp{
	
	@Autowired 
	DevelopRepository DevelopRepo;

	@Override
	public Develop postDevelop(Develop develop) {
		return DevelopRepo.save(develop) ;
	}

	@Override
	public Optional<Develop> get(int id) {
		return DevelopRepo.findById(id);
	}

	@Override
	public Develop update(Develop develop) {
		Optional<Develop> develop1=DevelopRepo.findById(develop.getNo());
		Develop develop2=develop1.get();
		develop2.setNo(develop.getNo());
		develop2.setName(develop.getName());
		return DevelopRepo.save(develop2);
	}
	
	@Override
	public String delete(int id) {
		DevelopRepo.deleteById(id);
		return "Deleted successfully";
	}


	@Override
	public List<Develop> getAll() {
		return DevelopRepo.findAll();
		
	}	
	
	
	
	
	
	
	

}
