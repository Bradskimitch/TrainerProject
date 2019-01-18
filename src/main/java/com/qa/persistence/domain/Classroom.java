package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Classroom {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	//@Column(name = "CLASSROOM_ID")
	private Long classroomID;
	
	//@Column(name = "TRAINER")
	private String trainer;
	
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "classroom")
	@OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Trainee> trainees = new ArrayList<>();

	public Classroom() {

	}

	public Classroom(String trainer) {
		this.trainer = trainer;
	}

	/*
	 * public void addTrainee(Trainee trainee) { this.trainees.add(trainee); if
	 * (trainee.getClassroom() != this) { trainee.setClassroom(this); } } public
	 * void setTrainees(List<Trainee> trainees) { this.trainees = trainees; }
	 */
	public Long getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(Long classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
