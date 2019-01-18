package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trainee")
public class Trainee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	//@Column(name = "TRAINEE_ID")
	private Long traineeID;
	
	//@Column(name = "TRAINEE")
	private String trainee;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name="classroomID")
	private Classroom classroom;

	public Trainee() {

	}

	public Trainee(String trainee) {
		this.trainee = trainee;
	}

	/*
	 * public void setClassroom(Classroom classroom) { this.classroom = classroom;
	 * if (!classroom.getTrainees().contains(this)) {
	 * classroom.getTrainees().add(this); } }
	 * 
	 * public Classroom getClassroom() { return classroom; }
	 */
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
