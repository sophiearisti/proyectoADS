package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = " Categoria")
public class Categoria {
	

	private String Nombre;
	
	private Boolean Individual;
	
	private Boolean Finalizado;
	
	Deportistas ListaDeportistas=new Deportistas();
	//private ArrayList<Deportista> Deportistas;
	
	//@XmlAttribute(name = "Resultados")
	Resultado resultados;
	
	
	//Constructores
	
	public Categoria() 
	{
		
	}
	
	public Categoria(String nombre,Boolean individual,Boolean finalizado,Deportistas deportistas) //ArrayList<Resultado> resultados)
	{
		
		this.Nombre= nombre;
		this.Individual = individual;
		this.Finalizado = finalizado;
		this.ListaDeportistas = deportistas;
		//this.resultados = resultados;
	}
	
	public String buscarCategoriaDeportista(Integer NoInscripcion) 
	{
		for(Deportista dep: ListaDeportistas.getDeportistasList())
		{
			if(dep.getNoInscripcion()==NoInscripcion)
			{
				return dep.getNombre();
			}
		}
		
		return "";
	}

	//Getters y setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Boolean getIndividual() {
		return Individual;
	}

	public void setIndividual(Boolean individual) {
		Individual = individual;
	}

	public Boolean getFinalizado() {
		return Finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		Finalizado = finalizado;
	}

	public ArrayList<Deportista> getDeportistas() {
		return ListaDeportistas.getDeportistasList();
	}
	
	public Deportistas getListaDeportistas() {
		return ListaDeportistas;
	}

	public void setListaDeportistas(Deportistas listaDeportistas) {
		ListaDeportistas = listaDeportistas;
	}

	public Resultado getResultados() {
		return resultados;
	}

	@XmlElement(name = "Resultado")
	public void setResultados(Resultado resultados) {
		this.resultados = resultados;
	}
	
	
	
	public Boolean AgregarDeportista(Deportista deportista)
	{
		Boolean insertado=false;
		
		//toca mirar si ya existe el deportista
		for(Deportista dep: ListaDeportistas.getDeportistasList())
		{
			if(deportista.getNoInscripcion().equals(dep.getNoInscripcion()))
			{
				insertado=true;
			}
		}
		
		if(insertado == false)
		{
			ListaDeportistas.addDeportista(deportista);
			insertado=true;
		}
		
		return insertado;
	}
	
	
	public ArrayList<Deportista> ObtenerDeportistas(){
		return ListaDeportistas.getDeportistasList();
		
	}
	
	public void ActualizarDeportistas(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
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
		
		return true;
	}
	
	public Boolean eliminar_deportista(Integer numeroInscripcion) 
	   {
			
			
		    Iterator<Deportista> iterador = ListaDeportistas.getDeportistasList().iterator();
		    
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
