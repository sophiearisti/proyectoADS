package Modelo;

import java.util.ArrayList;

public class Categoria {
	
	private String Nombre;
	
	private Boolean Individual;
	
	private Boolean Finalizado;
	
	private ArrayList<Deportista> Deportistas;
	private ArrayList<Resultado> resultados;
	
	
	//Constructores

	
	public Categoria(String nombre,Boolean individual,Boolean finalizado,ArrayList<Deportista> deportistas ,ArrayList<Resultado> resultados){
		
		this.Nombre= nombre;
		this.Individual = individual;
		this.Finalizado = finalizado;
		this.Deportistas = deportistas;
		this.resultados = resultados;
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

	public ArrayList<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(ArrayList<Resultado> resultados) {
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
	
	
	public void AgregarResultado(Resultado resultado) {
		
		resultados.add(resultado);
	}
	
	public boolean GuardarResultadoMedalla(Integer NoDeportista, String Medalla) 
	
	{
		
	}
	
	public ArrayList<Deportista> BuscarGanadores(){
		
		ArrayList<Deportista> DeportistasGanadores;
		for(Deportista pivote : Deportistas ) {
			
		if(pivote.getMedalla().equalsIgnoreCase("oro")) 
		{
			DeportistasGanadores.add(pivote);
		}else if (pivote.getMedalla().equalsIgnoreCase("plata")) 
			{
			
				DeportistasGanadores.add(pivote);
			}else if(pivote.getMedalla().equalsIgnoreCase("bronce") 
				{
					DeportistasGanadores.add(pivote);
				}
		
		}
		
		return DeportistasGanadores;
	}


	


	  
	
	
	
	

}
