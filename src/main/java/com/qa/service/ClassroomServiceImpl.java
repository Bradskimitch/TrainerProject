package com.qa.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService {
	
	@Inject
	ClassroomRepository repo;

	public String createClassroom(String classroom) {
		return repo.createClassroom(classroom);
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

	@Override
	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	@Override
	public String showAllTrainees() {
		return repo.showAllTrainees();
	}

	@Override
	public String updateTrainee(Long id, String trainee) {
		return repo.updateTrainee(id, trainee);
	}

	@Override
	public String deleteTrainee(Long id) {
		return repo.deleteTrainee(id);
	}

	

}
