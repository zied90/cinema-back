package com.sid.cinemaDemo.dao;

import com.sid.cinemaDemo.entitie.Cinema;
import com.sid.cinemaDemo.entitie.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SalleRepository  extends JpaRepository<Salle,Long> {
}
