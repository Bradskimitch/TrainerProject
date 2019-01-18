package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.service.ClassroomService;

@Path("/classroom")
public class ClassroomEndpoints {

	@Inject
	private ClassroomService service;

	@Path("classroom")
	@GET
	@Produces({ "application/json" })
	public String showAllClassrooms() {
		return service.showAllClassrooms();
	}

	@Path("classroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String classroom) {
		return service.createClassroom(classroom);
	}

	@Path("classroom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}

	@Path("classroom/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateClassroom(@PathParam("id") Long id, String classroom) {
		return service.updateClassroom(id, classroom);
	}
	
	@Path("trainee")
	@GET
	@Produces({ "application/json" })
	public String showAllTrainees() {
		return service.showAllTrainees();
	}

	@Path("trainee")
	@POST
	@Produces({ "application/json" })
	public String createTrainee(String trainee) {
		return service.createTrainee(trainee);
	}

	@Path("trainee/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("id") Long id) {
		return service.deleteTrainee(id);
	}

	@Path("trainee/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateTrainee(@PathParam("id") Long id, String trainee) {
		return service.updateTrainee(id, trainee);
	}

	public void setService(ClassroomService service) {
		this.service = service;
	}

}
