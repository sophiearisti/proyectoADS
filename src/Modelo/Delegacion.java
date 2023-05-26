package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;



public class Delegacion 
{
	private String Facultad;
	
	private String Representante;
	
	private Integer NumeroParticipantes;

	private Integer Puntuacion;
	
	Deportistas ListaDeportistas=new Deportistas();
	
	//private ArrayList<Deportista> Deportistas;
	
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
			Deportistas listaDeportistas) {
		super();
		Facultad = facultad;
		Representante = representante;
		NumeroParticipantes = numeroParticipantes;
		Puntuacion = 0;
		ListaDeportistas=listaDeportistas;
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

	public Deportistas getListaDeportistas() {
		return ListaDeportistas;
	}
	
	public ArrayList<Deportista> getDeportistas() {
		return ListaDeportistas.getDeportistasList();
	}
	
	//@XmlElement(name = "Deportista")
	public void setListaDeportistas(Deportistas listaDeportistas) {
		ListaDeportistas = listaDeportistas;
	}

	public Boolean AgregarDeportista(Deportista deportista)
	{
		Boolean insertado=true;
		
		//toca mirar si ya existe el deportista
		for(int i=0; i<ListaDeportistas.getDeportistasList().size(); i++)
		{
			if(true)
			{
				insertado=false;
			}
		}
		
		if(insertado)
		{
			ListaDeportistas.addDeportista(deportista);
			
		}
		
		return insertado;
	}
	
	public void ActualizarDeportista(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado)
	{
		for(Deportista dep: ListaDeportistas.getDeportistasList())
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
	
	public Boolean AnadirDeportista(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre)
	{
		
		Deportista elDeportista = new Deportista(id, nombre, primeraVez, estatura, abanderado, delegacion, categoria, disciplina);
		
		ListaDeportistas.addDeportista(elDeportista);
		
		setNumeroParticipantes(getNumeroParticipantes()+1);
		
		return true;
	}
	
   public Boolean eliminar_deportista(Integer numeroInscripcion) 
   {
		
		
	    Iterator<Deportista> iterador =ListaDeportistas.getDeportistasList().iterator();
	    
	    while (iterador.hasNext()) {
	        Deportista deportista = iterador.next();
	        if (deportista.getNoInscripcion() == numeroInscripcion) {
	            iterador.remove();
	            System.out.println("Deportista eliminado: " + deportista.getNombre());
	            return true; // Termina el método después de eliminar el deportista
	        }
	    }
	    
	    	
	    return false; 
	}
	
	
}
