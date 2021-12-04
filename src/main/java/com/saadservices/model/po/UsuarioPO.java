package com.saadservices.model.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioPO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuarioId", unique = true, nullable = false)
	private Integer usuarioId;
	
	@Column(name = "nombreUsuario")
	private String nombreUsuario;
	
	@Column(name = "apellidoUsuairo")
	private String apellidoUsuairo;
	
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	
	@Column(name = "curpUsuario")
	private String curpUsuario;
	
	@Column(name = "matriculaUsuario")
	private String matriculaUsuario;
	
	@Column(name = "rolUsuario")
	private int rolUsuario; 
	
	@Column(name = "fechaIngresoUsuario")
	private Date fechaIngresoUsuario;
	
	@Column(name = "fechaEgresoUsuario")
	private Date fechaEgresoUsuario;
	
	@Column(name = "fechaNacimiento")
	private Date fechaEdicion;
	
	@Column(name = "usuarioId")
	private Integer idUsuarioEdicion;
	
}
