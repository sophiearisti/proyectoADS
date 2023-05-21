package Modelo;

import java.util.ArrayList;

public class Deportistas 
{
	private ArrayList<Deportista> DeportistasList=new ArrayList<Deportista>();

	public Deportistas(ArrayList<Deportista> deportistasList) {
		super();
		DeportistasList = deportistasList;
	}

	public Deportistas() 
	{
		
	}

	public ArrayList<Deportista> getDeportistasList() {
		return DeportistasList;
	}

	public void setDeportistasList(ArrayList<Deportista> deportistasList) {
		DeportistasList = deportistasList;
	}
	
	public void AnadirDelegacion(Deportista deportistaNuevo)
	{
		this.DeportistasList.add(deportistaNuevo);
	}
	
	public void EditarDeportista(Integer id, String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String delegacionPertenece, String categoriaPertenece,String disciplinaPertenece)
	{
		for(Deportista dep: this.DeportistasList)
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
	
	public Deportista BuscarDeportista(Integer NoInscripcion)
	{
		Deportista encontrado=null;
		
		getDeportistasList();
		
		for(Deportista dep: DeportistasList)
		{
			if(dep.getNoInscripcion()==NoInscripcion)
			{
				encontrado=dep;
			}
		}
		
		return encontrado;
	}
	
}

