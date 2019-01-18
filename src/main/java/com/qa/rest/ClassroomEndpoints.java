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

@Path("/account")
public class ClassroomEndpoints {

	@Inject
	private ClassroomService service;

	@Path("json")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.showAllClassrooms();
	}

	@Path("json")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String classroom) {
		return service.createClassroom(classroom);
	}

	@Path("json/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}

	/*
	 * @Path("json/{id}")
	 * 
	 * @PUT
	 * 
	 * @Produces({ "application/json" }) public String
	 * updateAccount(@PathParam("id") Long id, String account) { return
	 * service.updateAccount(id, account); }
	 */
	public void setService(ClassroomService service) {
		this.service = service;
	}

}
