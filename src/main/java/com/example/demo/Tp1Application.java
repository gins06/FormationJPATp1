package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Artiste;
import com.example.demo.repository.ArtisteRepository;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner{

	@Autowired
	ArtisteRepository artisteRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		artisteRepository.save(new Artiste("Willis", "Bruce", "Masculin",60, "USA"));
		artisteRepository.save(new Artiste("Dujardin", "Jean", "Masculin",45, "France"));
		artisteRepository.save(new Artiste("Pitt", "Brad", "Masculin",50, "USA"));
		
	}

}
