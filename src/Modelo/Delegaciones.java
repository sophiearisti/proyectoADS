package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Delegaciones")
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
		/*ArrayList<Delegacion> prueba=new ArrayList<Delegacion> ();
		Deportistas Dep1=new Deportistas ();
		Deportistas Dep2=new Deportistas ();
		Deportistas Dep3=new Deportistas ();
		Deportistas Dep4=new Deportistas ();
		//////////delegacion 1//////////
		Dep3.addDeportista(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.addDeportista(new Deportista(2,"Laura Martin",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.addDeportista(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Dep3.addDeportista(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.addDeportista(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));
		
		prueba.add(new Delegacion("Ingenieria","Pablo Suarez",Dep3.getDeportistasList().size(),Dep3));
		DelegacionesList.add(new Delegacion("Ingenieria","Laura Martin",Dep3.getDeportistasList().size(),Dep3));
		/////////Delegacion 2/////////
		
		Dep1.addDeportista(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","relevos","atletismo"));
		Dep1.addDeportista(new Deportista(7,"Pablo Jimenez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.addDeportista(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep1.addDeportista(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.addDeportista(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		prueba.add(new Delegacion("Medicina","Pablo Suarez",Dep1.getDeportistasList().size(),Dep1));
		DelegacionesList.add(new Delegacion("Medicina","Pablo Jimenez",Dep1.getDeportistasList().size(),Dep1));
		
		////////Delegacion 3/////////
		Dep2.addDeportista(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.addDeportista(new Deportista(12,"Pablo Suarez",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.addDeportista(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep2.addDeportista(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));

		DelegacionesList.add(new Delegacion("CEA","Pablo Suarez",Dep2.getDeportistasList().size(),Dep2));
		
////////Delegacion 4/////////
		Dep4.addDeportista(new Deportista(11,"Claudia Coronado",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep4.addDeportista(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep4.addDeportista(new Deportista(13,"Pamela Sanchez",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep4.addDeportista(new Deportista(14,"Francisco Parra",true,123f,false,"CEA","balfemenino","baloncesto"));

		DelegacionesList.add(new Delegacion("Humanas","Juan Zuluaga",Dep4.getDeportistasList().size(),Dep4));
		
		*/
		
		return DelegacionesList;
	}

	@XmlElement(name = "Delegacion")
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
	
	public void AnadirDeportista(String disciplina, String categoria, String delegacion, boolean primeraVez,
			boolean abanderado, Float estatura, Integer id, String nombre)
	{
		
		for(Delegacion del: DelegacionesList)
		{
			if(delegacion.equals(del.getFacultad()))
			{
				del.AnadirDeportista(disciplina, categoria, delegacion, primeraVez, abanderado, estatura, id, nombre);

			}
			
		}
	
	}
	
 public Boolean eliminar_deportista(Integer numeroInscripcion,String delegacion) {
	    
	    for(Delegacion del: DelegacionesList)
		{
			if(delegacion.equals(del.getFacultad()))
			{
				del.eliminar_deportista(numeroInscripcion);

			}
			
		}
	    	
	    return false; 
	}
}
