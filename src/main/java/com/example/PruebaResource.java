package com.example;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/prueba")
public class PruebaResource {

	@Inject
	PruebaRepository pruebaRepository;

	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Prueba> listAll() {
		return pruebaRepository.listAll();
	}

	@GET
	@Path("name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Prueba findByName(@PathParam String name) {
		return pruebaRepository.findByName(name);
	}

}
