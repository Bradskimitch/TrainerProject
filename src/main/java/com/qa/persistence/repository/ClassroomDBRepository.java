package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.domain.Account;
import com.qa.persistence.domain.Classroom;
import com.qa.persistence.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepository implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String createClassroom(String classroom) {
		Classroom aClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(aClassroom);
		return "{Classroom Created}";
	}

	public String showAllClassrooms() {
		Query query = manager.createQuery("Select a FROM Classroom a");
		Collection<Classroom> classrooms = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		Classroom classroomInDB = findClassroom(id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}
		return "{Classroom Deleted}";
	}

	public String addTrainee(Long id, String trainee) {
	//	Trainee aClassroom = util.getObjectForJSON(trainee, Trainee.class);
	//	findClassroom(id);
	//	return "{Trainee Added}";
	}

	public String removeTrainee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateClassroom(Long id, String classroom) {
		// TODO Auto-generated method stub
		return null;
	}
	public Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}

}
