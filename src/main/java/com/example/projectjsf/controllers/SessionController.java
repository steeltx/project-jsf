/**
 * 
 */
package com.example.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.example.projectjsf.dto.UsuarioDTO;

/**
 * @author
 *
 * Clase que se encarga de mantener la información del usuario que hace login en sesión
 */
@ManagedBean
@SessionScoped
public class SessionController {

	/**
	 * Usuario que se mantiene en sesion
	 */
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesion del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacón de sesión");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
