package com.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabla_prueba")
public class Prueba {

	@Id
	public Long legajo;

	public String nombre;

	public String apellido;

	public Long telefono;

	public Long dni;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

}
