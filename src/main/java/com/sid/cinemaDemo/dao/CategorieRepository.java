package com.sid.cinemaDemo.dao;

import com.sid.cinemaDemo.entitie.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
