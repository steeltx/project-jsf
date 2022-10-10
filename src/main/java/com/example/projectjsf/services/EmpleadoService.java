/**
 * 
 */
package com.example.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.example.projectjsf.entity.Empleado;

/**
 * @author
 * 
 * Clase que permite realizar la logica del negocio para el empleado
 */
public class EmpleadoService {
	
	
	/**
	 * Metodo que permite consultar la lista de empleados
	 * @return {@link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleados() {
		
		// Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<>();
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		Empleado empleado4 = new Empleado();
		Empleado empleado5 = new Empleado();
		Empleado empleado6 = new Empleado();
		
		empleado1.setNombre("Empleado 1");
		empleado1.setPrimerApellido("Primer apellido 1");
		empleado1.setSegundoApellido("Segundo apellido 1");
		empleado1.setPuesto("Puesto 1");
		empleado1.setEstatus(true);
		
		empleado2.setNombre("Empleado 2");
		empleado2.setPrimerApellido("Primer apellido 2");
		empleado2.setSegundoApellido("Segundo apellido 2");
		empleado2.setPuesto("Puesto 2");
		empleado2.setEstatus(true);
		
		empleado3.setNombre("Empleado 3");
		empleado3.setPrimerApellido("Primer apellido 3");
		empleado3.setSegundoApellido("Segundo apellido 3");
		empleado3.setPuesto("Puesto 3");
		empleado3.setEstatus(true);
		
		empleado4.setNombre("Empleado 4");
		empleado4.setPrimerApellido("Primer apellido 4");
		empleado4.setSegundoApellido("Segundo apellido 4");
		empleado4.setPuesto("Puesto 4");
		empleado4.setEstatus(true);
		
		empleado5.setNombre("Empleado 5");
		empleado5.setPrimerApellido("Primer apellido 5");
		empleado5.setSegundoApellido("Segundo apellido 5");
		empleado5.setPuesto("Puesto 5");
		empleado5.setEstatus(true);
		
		empleado6.setNombre("Empleado 6");
		empleado6.setPrimerApellido("Primer apellido 6");
		empleado6.setSegundoApellido("Segundo apellido 6");
		empleado6.setPuesto("Puesto 6");
		empleado6.setEstatus(true);
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		empleados.add(empleado5);
		empleados.add(empleado6);
		
		return empleados;
	}
}
