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

import io.altar.jseprojectp2.model.Product;
import io.altar.jseprojectp2.services.ProductService;

@Path("products")

public class ProductController {

	private ProductService ps = new ProductService();

	@Context
	protected UriInfo context;

	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN) // texto
	public String status() {
		return "Url " + context.getRequestUri().toString() + " is Ok";
	}

	// Get all Products
	@GET
	@Produces(MediaType.APPLICATION_JSON) // application/json
	public Collection<Product> getAll() { //mofifiers retorna um colecção de products chamada getAll e vai ao product service chamar o getAll
		return ps.getAll();
	}

	// Get Product Id
	@GET
	@Path("/{id")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getEntity(@PathParam("id") int id) {
		Product product = ps.getEntity(id);
		return product;
	}

	// Create product
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addEntity(Product product) {
		return Integer.toString(ps.addEntity(product));
	}

	// Edit product
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editEntity(Product product) { // método void não retorna nada
		ps.editEntity(product); //mas tehno que chamar o método
	}

	// Remove product
	@DELETE
	@Path("/{id}")
	public void removeEntity(@PathParam("id") int id) {
		ps.removeEntity(id);

	}

}
