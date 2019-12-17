package com.example.demo.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainer/{Trainer id}/pokemon")
public class PokemonController {
	@Autowired
	private PokemonService pokemonService;
	
	@PostMapping
	public Pokemon addPokemon(@PathVariable Long trainerId, @RequestBody Pokemon pokemon){
		return pokemonService.addPokemon();
	}



}
