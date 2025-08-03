package io.altar.jseprojectp2.controllers;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	

	private static final int Product = 0;

	private static final int Collection = 0;

	private ProductService ps = new ProductService();

	@Context
	protected UriInfo context;

	@GET
	@Path("status")
	@Produces(MediaType.TEXT_PLAIN) // qual o retorno
	public String status() {
		return "Url " + context.getRequestUri().toString() + " is Ok";
	}
// S R T
	
	
	// 
	@GET
	@Path("getAll")
	@Produces(Collection<Product>)
	public Collection<Product> getAll() {
		return ps.getAll();
	}
	
	
	
	// Get Entity Id
	@GET
	@Path("/{id")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getEntity(@PathParam("id") int id) {
		Product product = ps.getEntity(id);
		return product;
	}
	
	
	
	// Create product
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addEntity(Product product) {
		return Integer.toString(ps.addEntity(product));
	}
	
	//
	
}
