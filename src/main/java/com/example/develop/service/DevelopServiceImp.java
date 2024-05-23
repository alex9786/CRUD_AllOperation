package com.example.develop.service;

import java.util.List;
import java.util.Optional;

import com.example.develop.entity.Develop;

public interface DevelopServiceImp {

	Develop postDevelop(Develop develop);

	Optional<Develop> get(int id);

	Develop update(Develop develop);

	List<Develop> getAll();

	String delete(int id);

	
}
