package com.sid.cinemaDemo;

import com.sid.cinemaDemo.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaDemoApplication implements CommandLineRunner {
	@Autowired
private ICinemaService cinemaService;
	public static void main(String[] args) {
		SpringApplication.run(CinemaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cinemaService.initVilles();
		cinemaService.initCinemas();
		cinemaService.initSalles();
		cinemaService.initPlaces();
		cinemaService.initSeances();
		cinemaService.initCategories();
		cinemaService.initFilms();
		cinemaService.initProjections();
		cinemaService.initTickets();

	}
}
