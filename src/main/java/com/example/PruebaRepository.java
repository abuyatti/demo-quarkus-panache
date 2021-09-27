package com.example;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PruebaRepository implements PanacheRepository<Prueba> {

	public Prueba findByName(String name) {
		return find("nombre", name).firstResult();
	}

}
