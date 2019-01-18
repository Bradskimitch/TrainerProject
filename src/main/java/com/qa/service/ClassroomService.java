package com.qa.service;

public interface ClassroomService {
	String createClassroom(String classroom);
	String addTrainee(Long id);
	String removeTrainee(Long id);
	String showAllClassrooms();
	String updateClassroom(Long id, String classroom);
	String deleteClassroom(Long id);
}
