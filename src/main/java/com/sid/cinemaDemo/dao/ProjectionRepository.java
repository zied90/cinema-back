package com.sid.cinemaDemo.dao;

import com.sid.cinemaDemo.entitie.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectionRepository  extends JpaRepository<ProjectionFilm,Long> {
}
