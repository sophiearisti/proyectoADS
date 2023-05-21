package Modelo;

import java.util.ArrayList;

public class Delegaciones
{
	private ArrayList<Delegacion> DelegacionesList=new ArrayList<Delegacion>();

	
	public Delegaciones(ArrayList<Delegacion> delegacionesList) {
		super();
		DelegacionesList = delegacionesList;
	}
	
	public Delegaciones() 
	{
		
	}
	
	public ArrayList<Delegacion> getDelegacionesList() 
	{
		return DelegacionesList;
	}

	public void setDelegacionesList(ArrayList<Delegacion> delegacionesList) 
	{
		DelegacionesList = delegacionesList;
	}
	
	public void AnadirDelegacion(Delegacion delegacionnueva)
	{
		this.DelegacionesList.add(delegacionnueva);
	}
	
	public void ActualizarDeportistaDelegacion(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String delegacionPertenece)
	{
		
		for(Delegacion del: this.DelegacionesList)
		{
			if(del.getFacultad().equals(delegacionPertenece))
			{
				//System.out.println("si");
				del.ActualizarDeportista(id,nombre, asistenciaPrimeraVez, estatura,
						abanderado);
			}
		}
	}
	
}
