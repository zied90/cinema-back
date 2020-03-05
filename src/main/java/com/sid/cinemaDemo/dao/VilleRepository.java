package com.sid.cinemaDemo.dao;

import com.sid.cinemaDemo.entitie.Cinema;
import com.sid.cinemaDemo.entitie.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface VilleRepository extends JpaRepository<Ville, Long> {
}
