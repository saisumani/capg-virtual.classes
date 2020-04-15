package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Trainee;

public interface ITrainee extends JpaRepository<Trainee, Integer> {

}
