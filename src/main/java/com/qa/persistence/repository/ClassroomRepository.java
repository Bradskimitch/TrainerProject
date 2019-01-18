package com.qa.persistence.repository;

import com.qa.persistence.domain.Trainee;

public interface ClassroomRepository {

	String createClassroom(String classroom);
	String addTrainee(Long id);
	String removeTrainee(Long id);
	String showAllClassrooms();
	String updateClassroom(Long id, String classroom);
	String deleteClassroom(Long id);
}
