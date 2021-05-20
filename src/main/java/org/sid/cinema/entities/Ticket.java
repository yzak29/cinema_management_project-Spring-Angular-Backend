package org.sid.cinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Ticket {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double prix;
	@Column(length = 75)
	private String nomClient;
	@Column(unique = true)
	private int codePayement;
	private boolean reservee;
	@ManyToOne
	private Projection projection;
	@ManyToOne
	private Place place;

}
