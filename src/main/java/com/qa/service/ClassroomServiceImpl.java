package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	ClassroomRepository repo;

	public String createClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}

	public String addTrainee(Long id) {
		return repo.addTrainee(id);
	}

	public String removeTrainee(Long id) {
		return repo.removeTrainee(id);
	}

	public String showAllClassrooms() {
		return repo.showAllClassrooms();
	}

	public String updateClassroom(Long id, String classroom) {
		return repo.updateClassroom(id, classroom);
	}

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}

}
