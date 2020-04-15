package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Trainee;
import com.example.demo.repo.ITrainee;


@Service
public class TraineeService {

	@Autowired
	ITrainee repo;
	

	@Transactional
	public Trainee addTrainee(Trainee trainee) {
		return  repo.save(trainee);
	}

	@Transactional
	public boolean deleteTrainee(int traineeId) {
		repo.deleteById(traineeId);
		return !repo.existsById(traineeId);
	}

	@Transactional
	public Trainee updateTrainee(Trainee trainee) {
	    Trainee newTrainee=repo.getOne(trainee.getTraineeId());
	    newTrainee.setTraineeName(trainee.getTraineeName());
	    newTrainee.setTraineeLocation(trainee.getTraineeLocation());
	    newTrainee.setTraineeDomain(trainee.getTraineeDomain());
	    repo.save(newTrainee);
		return trainee;
	}

	public Trainee getTraineeById(int traineeId) {
		return repo.getOne(traineeId);
	}
	
	public List<Trainee> getAllTrainees() {
		return repo.findAll();
	}
	
}
