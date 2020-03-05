package com.sid.cinemaDemo.dao;

import com.sid.cinemaDemo.entitie.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlaceRepsitory extends JpaRepository<Place,Long> {
}
