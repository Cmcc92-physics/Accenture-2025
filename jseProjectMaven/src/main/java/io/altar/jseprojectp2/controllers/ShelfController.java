package io.altar.jseprojectp2.controllers;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

@Path("shelves")

public class ShelfController {

	private ShelfService ss = new ShelfService();

	@Context
	protected UriInfo context;

	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN) // qual o retorno
	public String status() {
		return "Url " + context.getRequestUri().toString() + " is Ok";
	}

	// Get all Shelves
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Shelf> getAll() {
		return ss.getAll();
	}

	// Get Shelf Id
	@GET
	@Path("/{id")
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf getEntity(@PathParam("id") int id) {
		Shelf shelf = ss.getEntity(id);
		return shelf;
	}

	// Create shelf
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addEntity(Shelf shelf) {
		System.out.println(shelf);
		return Integer.toString(ss.addEntity(shelf));
	}

	// Edit shelf
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editEntity(Shelf shelf) {
		ss.editEntity(shelf);
	}

	// Remove shelf
	@DELETE
	@Path("/{id}")
	public void removeEntity(@PathParam("id") int id) {
		ss.removeEntity(id);

	}

}
