package Modelo;

import java.util.ArrayList;

/*import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;*/


//@XmlRootElement(name = "Deportistas")
//@XmlAccessorType(XmlAccessType.FIELD)

public class Deportistas 
{
	//@XmlElement(name = "DeportistasList")
	private ArrayList<Deportista> DeportistasList=new ArrayList<Deportista>();

	public Deportistas(ArrayList<Deportista> deportistasList) {
		super();
		DeportistasList = deportistasList;
	}

	public Deportistas() 
	{
		
	}

	public ArrayList<Deportista> getDeportistasList() 
	{
		ArrayList<Deportista> Dep3=new ArrayList<> ();
		
		DeportistasList.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		DeportistasList.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		DeportistasList.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		DeportistasList.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		DeportistasList.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));;
		DeportistasList.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","100metros","atletismo"));
		DeportistasList.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","100metros","atletismo"));
		DeportistasList.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","100metros","atletismo"));
		DeportistasList.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","100metros","atletismo"));
		DeportistasList.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","100metros","atletismo"));
		DeportistasList.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","100metros","atletismo"));
		DeportistasList.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","100metros","atletismo"));
		DeportistasList.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","100metros","atletismo"));
		DeportistasList.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","100metros","atletismo"));
		
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
	public Integer buscar_indice_deportista(Integer NoInscripcion)
	{
		int encontrado = 0;
		int contador = 0;
		
		getDeportistasList();
		
		for(Deportista dep: DeportistasList)
		{
			contador++;
			if(dep.getNoInscripcion()==NoInscripcion)
			{
				encontrado=contador;
			}
		}
		
		return encontrado;
	}
	
	public void eliminar_deportista(Integer indice) {
		this.DeportistasList.remove(indice);
	}
	
	public Boolean deportista_registrado(Integer NoInscripcion, String Nombre) {
		
		getDeportistasList();
		boolean registrado = false;
		for(Deportista dep: DeportistasList) {
			if((dep.getNoInscripcion()==NoInscripcion)&&(dep.getNombre().equals(Nombre))) {
				registrado = true;
			}
		}
		
		return registrado;
	}
	
}

