package com.example.demo.pokemon;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerRepository trainerRepository;
	
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Trainer> getAllTrainers(){
		return trainerRepository.findAll();
	}

	public Trainer creatreTrainer(Trainer trainer) {		
		return trainerRepository.save(trainer);
	}
	
	public Trainer getTrainerById(Long id){
		Optional<Trainer> optionalTrainer = trainerRepository.findById(id);
		return optionalTrainer.orElseThrow(() ->new RuntimeException("Nao tem treinador seu boco")); //lambda expression
	}
	
	public void deleteTrainer(Long id){		
		trainerRepository.deleteById(id);
	}
	
	public void updateTrainer(Trainer trainer){
		trainerRepository.save(trainer);
	}
}
