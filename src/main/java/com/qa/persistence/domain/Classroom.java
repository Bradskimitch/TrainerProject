package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Classroom {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomID;
	private String trainer;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "classroom")
	private List<Trainee> trainees = new ArrayList<>();

	public Classroom() {

	}

	public Classroom(String trainer) {
		this.trainer = trainer;
	}

	public void addTrainee(Trainee trainee) {
		this.trainees.add(trainee);
		if (trainee.getClassroom() != this) {
			trainee.setClassroom(this);
		}
	}

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

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

}
