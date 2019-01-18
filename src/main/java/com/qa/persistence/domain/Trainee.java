package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;
	private String trainee;
	
	public Trainee(){
		
	}
	public Trainee(String trainee) {
		this.trainee = trainee;
	}
	public Long getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}
	public String getTrainee() {
		return trainee;
	}
	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}
	
	

}
