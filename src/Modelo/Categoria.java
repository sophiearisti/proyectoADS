package Modelo;

import java.util.ArrayList;

/*import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;*/

//@XmlRootElement(name = "Categoria")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Categoria {
	
	//@XmlAttribute(name = "Nombre")
	private String Nombre;
	
	//@XmlAttribute(name = "Individual")
	private Boolean Individual;
	
	//@XmlAttribute(name = "Finalizado")
	private Boolean Finalizado;
	
	//@XmlAttribute(name = "Deportistas")
	private ArrayList<Deportista> Deportistas;
	
	//@XmlAttribute(name = "Resultados")
	Resultado resultados;
	
	
	//Constructores
	
	public Categoria() 
	{
		
	}
	
	public Categoria(String nombre,Boolean individual,Boolean finalizado,ArrayList<Deportista> deportistas) //ArrayList<Resultado> resultados)
	{
		
		this.Nombre= nombre;
		this.Individual = individual;
		this.Finalizado = finalizado;
		this.Deportistas = deportistas;
		//this.resultados = resultados;
	}
	
	public String buscarCategoriaDeportista(Integer NoInscripcion) 
	{
		for(Deportista dep: Deportistas)
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
		return Deportistas;
	}

	public void setDeportistas(ArrayList<Deportista> deportistas) {
		Deportistas = deportistas;
	}

	public Resultado getResultados() {
		return resultados;
	}

	public void setResultados(Resultado resultados) {
		this.resultados = resultados;
	}
	
	
	
	public Boolean AgregarDeportista(Deportista deportista)
	{
		Boolean insertado=false;
		
		//toca mirar si ya existe el deportista
		for(int indice= 0;indice< Deportistas.size();indice++)
		{
			if(deportista.equals(Deportistas.get(indice)))
			{
				insertado=true;
			}
			
		}
		
		if(insertado == false)
		{
			Deportistas.add(deportista);
			insertado=true;
		}
		
		return insertado;
	}
	
	
	public ArrayList<Deportista> ObtenerDeportistas(){
		return this.Deportistas;
		
	}
	
	public void ActualizarDeportistas(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
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
