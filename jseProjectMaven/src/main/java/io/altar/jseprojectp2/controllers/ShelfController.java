package io.altar.jseprojectp2.controllers;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.jseprojectp2.model.Shelf;
import io.altar.jseprojectp2.services.ShelfService;

@Path("shelves")
public class ShelfController {
	
	ShelfService ss = new ShelfService();
	
	// Create Shelf
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int addEntity(Shelf shelf) {
		return ss.addEntity(shelf);
	}
	

	

}

