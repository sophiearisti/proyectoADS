package Modelo;

import java.io.File;

/*import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;*/


//@XmlRootElement(name = "Deportista")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Deportista {

	//@XmlAttribute(name = "NoInscripcion")
	private Integer NoInscripcion;
	
	//@XmlAttribute(name = "Nombre")
	private String Nombre;
	
	//@XmlAttribute(name = "AsistenciaPrimeraVez")
	private Boolean AsistenciaPrimeraVez;
	
	//@XmlAttribute(name = "Estatura")
	private Float Estatura;
	
	//@XmlAttribute(name = "Medalla")
	private String Medalla;
	
	//@XmlAttribute(name = "Abanderado")
	private Boolean Abanderado;
	
	//@XmlAttribute(name = "DelegacionPertenece")
	private String DelegacionPertenece;
	
	//@XmlAttribute(name = "CategoriaPertenece")
	private String CategoriaPertenece;
	
	//@XmlAttribute(name = "DisciplinaPertenece")
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

