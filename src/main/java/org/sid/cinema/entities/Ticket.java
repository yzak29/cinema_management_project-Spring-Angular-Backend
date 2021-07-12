package org.sid.cinema.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Getter @Setter
public class Ticket {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double prix;
	@Column(length = 75)
	private String nomClient;
	@Column(unique = false, nullable = true)
	private Integer codePayement;
	private boolean reservee;
	@ManyToOne
	private Projection projection;
	@ManyToOne
	private Place place;

}
