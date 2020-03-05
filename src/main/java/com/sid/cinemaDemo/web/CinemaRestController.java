package com.sid.cinemaDemo.web;


import com.sid.cinemaDemo.dao.FilmRepsitory;
import com.sid.cinemaDemo.dao.TicketRepository;
import com.sid.cinemaDemo.entitie.Film;
import com.sid.cinemaDemo.entitie.Ticket;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CinemaRestController {
    @Autowired
    FilmRepsitory filmRepsitory;
    @Autowired
    TicketRepository ticketRepository;

    @GetMapping(path = "/imageFilm/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] image(@PathVariable(name = "id") Long id) throws Exception {
        Film f = filmRepsitory.findById(id).get();
        String photoName = f.getPhoto();
        File file = new File(System.getProperty("user.home") + "/images-cinemas/" + photoName);
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path);
    }

    @PostMapping("payerTickets")
    @Transactional
    public List<Ticket> payerTicket(@RequestBody TicketForm ticketForm) {
        List<Ticket> listTickets = new ArrayList<>();
        ticketForm.getTickets().forEach(idticket -> {
            System.out.println(idticket);
            Ticket ticket = ticketRepository.findById(idticket).get();
            ticket.setNomClient(ticketForm.getNomClient());
            ticket.setReservee(true);
            ticket.setCodePayement(ticketForm.getCodePayement());
            ticketRepository.save(ticket);
            listTickets.add(ticket);
        });
        return listTickets;
    }

}

@Data
class TicketForm {
    private String nomClient;
    private Integer codePayement;
    private List<Long> tickets = new ArrayList<>();
}
