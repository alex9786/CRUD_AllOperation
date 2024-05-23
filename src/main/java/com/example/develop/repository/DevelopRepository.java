package com.example.develop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.develop.entity.Develop;

@Repository
public interface DevelopRepository extends JpaRepository<Develop, Integer> {

}
