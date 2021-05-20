package org.sid.cinema.services;

import java.util.stream.Stream;

import org.sid.cinema.dao.VilleRepository;
import org.sid.cinema.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaInitServiceImpl implements ICinemaInitService {
	
	@Autowired
	private VilleRepository villeRepository;
	
	@Override
	public void initVilles() {
		Stream.of("casablanca","marrakech","rabat","tanger").forEach(nomVille->{
			Ville ville = new Ville();
			ville.setNom(nomVille);
			villeRepository.save(ville);
		});
		
	}

	@Override
	public void initCinemas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSalles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initPlaces() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSeances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initCategories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initFilms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initProjections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTickets() {
		// TODO Auto-generated method stub
		
	}

}
