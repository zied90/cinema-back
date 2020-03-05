package com.sid.cinemaDemo.dao;


import com.sid.cinemaDemo.entitie.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepsitory extends JpaRepository<Film,Long> {
}
