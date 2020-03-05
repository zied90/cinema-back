package com.sid.cinemaDemo.dao;

import com.sid.cinemaDemo.entitie.Cinema;
import com.sid.cinemaDemo.entitie.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
