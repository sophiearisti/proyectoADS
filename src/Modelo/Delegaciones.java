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
		ArrayList<Delegacion> prueba=new ArrayList<Delegacion> ();
		ArrayList<Deportista> Dep=new ArrayList<> ();
		ArrayList<Deportista> Dep1=new ArrayList<> ();
		ArrayList<Deportista> Dep2=new ArrayList<> ();
		ArrayList<Deportista> Dep3=new ArrayList<> ();
		//////////delegacion 1//////////
		Dep3.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));
		
		prueba.add(new Delegacion("Ingenieria","Pablo Suarez",Dep3.size(),Dep3));
		DelegacionesList.add(new Delegacion("Ingenieria","Pablo Suarez",Dep3.size(),Dep3));
		/////////Delegacion 2/////////
		Dep.clear();
		Dep1.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		prueba.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		DelegacionesList.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		
		////////Delegacion 3/////////
		Dep.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));
		
		prueba.add(new Delegacion("CEA","Pablo Suarez",Dep2.size(),Dep2));
		DelegacionesList.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		
		
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
