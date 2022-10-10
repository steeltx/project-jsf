/**
 * 
 */
package com.example.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author
 *
 * Clase que se encarga de cerrar la sesión del usuario
 */
@ManagedBean
public class SessionCloseController {

	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión");
	}
	
	/**
	 * Metodo que permite cerrar la sesión y regresar al login
	 */
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Redireccionar a una pantalla
	 * @param pagina {@link String} pagina a redireccionarse
	 * @throws IOException En caso de error al encontrar la pagina
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
}
