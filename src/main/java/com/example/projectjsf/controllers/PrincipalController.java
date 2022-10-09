package com.example.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.example.projectjsf.entity.Empleado;
import com.example.projectjsf.services.EmpleadoService;

/**
 * @author
 *
 * Clase controller que se encarga de procesas informacion para la pantalla principal .xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga de inicializar la información de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
