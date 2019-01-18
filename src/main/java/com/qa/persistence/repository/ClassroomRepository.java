package com.qa.persistence.repository;

import com.qa.persistence.domain.Trainee;

public interface ClassroomRepository {

	String createClassroom(String classroom);
	String showAllClassrooms();
	String updateClassroom(Long id, String classroom);
	String deleteClassroom(Long id);
	
	String createTrainee(String trainee);
	String showAllTrainees();
	String updateTrainee(Long id, String trainee);
	String deleteTrainee(Long id);
	
}
