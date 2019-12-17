package com.example.demo.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
	
	@Autowired
	private TrainerService trainerService;
	
	public Pokemon addPokemon(Long trainerId, Pokemon pokemon){
		Trainer trainer = trainerService.getTrainerById(trainerId);
		trainer.getPokemons().add(pokemon);
		return pokemonRepository.save(pokemon);
	}
}
