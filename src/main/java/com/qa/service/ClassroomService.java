package com.qa.service;

public interface ClassroomService {
	String createClassroom(String classroom);
	String showAllClassrooms();
	String updateClassroom(Long id, String classroom);
	String deleteClassroom(Long id);
	
	String createTrainee(String trainee);
	String showAllTrainees();
	String updateTrainee(Long id, String trainee);
	String deleteTrainee(Long id);
	
}
