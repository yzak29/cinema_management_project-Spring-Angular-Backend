package org.sid.cinema.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Place {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numeroPlace;
	private double longitude, latitude, altitude;
	@ManyToOne
	private Salle salle;
	@OneToMany(mappedBy = "place")
	private Collection<Ticket> tickets;

}
