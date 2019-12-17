package com.example.demo.pokemon;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/trainers")
public class TrainerController {
	
	@Autowired
	private TrainerService trainerService; 	
	
	@GetMapping
	public Iterable<Trainer> getAllTrainers(){
		return trainerService.getAllTrainers();
	}
	
	@PostMapping
	public Trainer createTrainer(@RequestBody Trainer trainer){
		return trainerService.creatreTrainer(trainer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTrainer(Long id){
		trainerService.deleteTrainer(id);
	}
	
	@PutMapping("/{id}")
	public void updateTrainer(@PathVariable Long id, @RequestBody Trainer trainer){
		trainerService.updateTrainer(trainer);
	}
	
	/*@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Set<Trainer> getAllTrainers(){
		
		Trainer trainer = new Trainer();
		trainer.setName("Caio");
		
		Set<Trainer> trainers = new HashSet<>();
		trainers.add(trainer);
		
		trainer.setName("Cesar");
		trainers.add(trainer);
		return trainers;
		
	}*/

}
