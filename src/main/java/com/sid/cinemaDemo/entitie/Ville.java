package com.sid.cinemaDemo.entitie;

import com.sid.cinemaDemo.entitie.Cinema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Ville implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longitude;
    private double latitude;
    private double attitude;
    @OneToMany(mappedBy = "ville",
            cascade = CascadeType.ALL)
    private Collection<Cinema> cinemas;
}
