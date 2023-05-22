package Modelo;

import java.util.ArrayList;

/*import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;*/


//@XmlRootElement(name = "Delegacion")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Delegacion 
{
	//@XmlAttribute(name = "Facultad")
	private String Facultad;
	
	//@XmlAttribute(name = "Representante")
	private String Representante;
	
	//@XmlAttribute(name = "NumeroParticipantes")
	private Integer NumeroParticipantes;
	
	//@XmlAttribute(name = "Puntuacion")
	private Integer Puntuacion;
	
	//@XmlAttribute(name = "Deportistas")
	private ArrayList<Deportista> Deportistas;
	
	//Constructores
	public Delegacion(String facultad, String representante) {
		super();
		Facultad = facultad;
		Representante = representante;
		NumeroParticipantes = 0;
		Puntuacion = 0;
	}
	
	public Delegacion() 
	{
		
	}
	
	
	public Delegacion(String facultad, String representante, Integer numeroParticipantes,
			ArrayList<Deportista> deportistas) {
		super();
		Facultad = facultad;
		Representante = representante;
		NumeroParticipantes = numeroParticipantes;
		Puntuacion = 0;
		Deportistas = deportistas;
	}


	//getters y setters
	public String getFacultad() {
		return Facultad;
	}

	public void setFacultad(String facultad) {
		Facultad = facultad;
	}

	public String getRepresentante() {
		return Representante;
	}

	public void setRepresentante(String representante) {
		Representante = representante;
	}

	public Integer getNumeroParticipantes() {
		return NumeroParticipantes;
	}

	public void setNumeroParticipantes(Integer numeroParticipantes) {
		NumeroParticipantes = numeroParticipantes;
	}

	public Integer getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		Puntuacion = puntuacion;
	}


	public ArrayList<Deportista> getDeportistas() {
		return Deportistas;
	}


	public void setDeportistas(ArrayList<Deportista> deportistas) {
		Deportistas = deportistas;
	}
	
	public Boolean AgregarDeportista(Deportista deportista)
	{
		Boolean insertado=true;
		
		//toca mirar si ya existe el deportista
		for(int i=0; i<Deportistas.size(); i++)
		{
			if(true)
			{
				insertado=false;
			}
		}
		
		if(insertado)
		{
			Deportistas.add(deportista);
		}
		
		return insertado;
	}
	
	public void ActualizarDeportista(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado)
	{
		for(Deportista dep: Deportistas)
		{
			if(id==dep.getNoInscripcion())
			{
				dep.setNombre(nombre);
				dep.setAsistenciaPrimeraVez(asistenciaPrimeraVez);
				dep.setAbanderado(abanderado);
				dep.setEstatura(estatura);
			}
			
		}
	}
	
	
}
