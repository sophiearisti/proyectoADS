package Modelo;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Deportista {

	private Integer NoInscripcion;
	private String Nombre;
	private Boolean AsistenciaPrimeraVez;
	private Float Estatura;
	private String Medalla;
	private Boolean Abanderado;
	private String DelegacionPertenece;
	private String CategoriaPertenece;
	private String DisciplinaPertenece;
	
	
	
	public Deportista(Integer noInscripcion, String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado, String delegacionPertenece, String categoriaPertenece,String disciplinaPertenece) {
		super();
		NoInscripcion = noInscripcion;
		Nombre = nombre;
		AsistenciaPrimeraVez = asistenciaPrimeraVez;
		Estatura = estatura;
		Abanderado = abanderado;
		this.Medalla = "ninguna";
		DelegacionPertenece = delegacionPertenece;
		CategoriaPertenece = categoriaPertenece;
		DisciplinaPertenece = disciplinaPertenece;
	}


	public String getCategoriaPertenece() {
		return CategoriaPertenece;
	}


	public void setCategoriaPertenece(String categoriaPertenece) {
		CategoriaPertenece = categoriaPertenece;
	}


	public String getDisciplinaPertenece() {
		return DisciplinaPertenece;
	}


	public void setDisciplinaPertenece(String disciplinaPertenece) {
		DisciplinaPertenece = disciplinaPertenece;
	}


	public Deportista() {
		
	}

	
	public Integer getNoInscripcion() {
		return NoInscripcion;
	}

	public void setNoInscripcion(Integer noInscripcion) {
		NoInscripcion = noInscripcion;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Boolean getAsistenciaPrimeraVez() {
		return AsistenciaPrimeraVez;
	}

	public void setAsistenciaPrimeraVez(Boolean asistenciaPrimeraVez) {
		AsistenciaPrimeraVez = asistenciaPrimeraVez;
	}

	public Float getEstatura() {
		return Estatura;
	}

	public void setEstatura(Float estatura) {
		Estatura = estatura;
	}

	public String getMedalla() {
		return Medalla;
	}

	public void setMedalla(String medalla) {
		Medalla = medalla;
	}

	public Boolean getAbanderado() {
		return Abanderado;
	}

	public void setAbanderado(Boolean abanderado) {
		Abanderado = abanderado;
	}

	public String getDelegacionPertenece() {
		return DelegacionPertenece;
	}

	public void setDelegacionPertenece(String delegacionPertenece) {
		DelegacionPertenece = delegacionPertenece;
	}

	

}

