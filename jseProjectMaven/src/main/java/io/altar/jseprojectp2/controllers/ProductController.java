package io.altar.jseprojectp2.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("products")

public class ProductController {

	@Context
	protected UriInfo context;

	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN) // qual o retorno
	public String status() {
		return "Url " + context.getRequestUri().toString() + " is Ok";
	}

}
