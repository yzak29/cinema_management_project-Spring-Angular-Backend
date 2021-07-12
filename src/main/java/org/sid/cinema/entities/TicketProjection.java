package org.sid.cinema.entities;

import org.springframework.data.rest.core.config.Projection;


@Projection(name = "ticketProj" , types = Ticket.class)
public interface TicketProjection {

    public Long getId();
    public double getPrix();
    public String getNomClient();
    public Integer getCodePayement();
    public Place getPlace();
    public boolean getReservee();



}
