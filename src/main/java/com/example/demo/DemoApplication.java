package com.example.demo;

import com.example.demo.data.Voiture;
import com.example.demo.data.VoitureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.Random;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	//injection de dependence
	@Autowired
	private VoitureRepository voiture;

	private static final Logger logger =
			LoggerFactory.getLogger(VoitureRepository.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		voiture.save(new Voiture("Mercedes", 10000));
		voiture.save(new Voiture("Audi", 10));
		voiture.save(new Voiture("Citroen", 100));
		voiture.save(new Voiture("Renault", 1000));
	}
}


