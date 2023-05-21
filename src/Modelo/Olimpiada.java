package Modelo;

import java.util.ArrayList;

public class Olimpiada 
{
	private static ArrayList<Delegacion> Delegaciones=new ArrayList<Delegacion>();
	private static ArrayList<Disciplina> Disciplinas=new ArrayList<Disciplina>();
	private static ArrayList<Juez> Jueces;
	private static ArrayList<Deportista> Deportistas=new ArrayList<Deportista>();
	
	
	public Olimpiada(ArrayList<Delegacion> delegaciones, ArrayList<Disciplina> disciplinas, ArrayList<Juez> jueces) 
	{
		Delegaciones = delegaciones;
		Disciplinas = disciplinas;
		Jueces = jueces;
	}
	
	public static ArrayList<Delegacion> getDelegaciones() {
		
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
		Delegaciones.add(new Delegacion("Ingenieria","Pablo Suarez",Dep3.size(),Dep3));
		/////////Delegacion 2/////////
		Dep.clear();
		Dep1.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		prueba.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		Delegaciones.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		
		////////Delegacion 3/////////
		Dep.clear();
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));
		
		prueba.add(new Delegacion("CEA","Pablo Suarez",Dep2.size(),Dep2));
		Delegaciones.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		
		return prueba;
	}
	
	public static void setDelegaciones(ArrayList<Delegacion> delegaciones) {
		Delegaciones = delegaciones;
	}
	
	public static ArrayList<Disciplina> getDisciplinas() 
	{
		ArrayList<Categoria> categorias1=new ArrayList<Categoria> ();
		ArrayList<Categoria> categorias2=new ArrayList<Categoria> ();
		
		ArrayList<Deportista> Dep1=new ArrayList<> ();
		ArrayList<Deportista> Dep2=new ArrayList<> ();
		ArrayList<Deportista> Dep3=new ArrayList<> ();
		
		//////////delegacion 1//////////
		Dep3.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Dep3.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));
		
		categorias1.add(new Categoria("100metros",true,false,Dep3));
		
		/////////Delegacion 2/////////
		Dep1.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","relevos","atletismo"));
		Dep1.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","relevos","atletismo"));
		
		categorias1.add(new Categoria("relevos",false,false,Dep1));
		
		Disciplinas.add(new Disciplina(categorias1,"atletismo"));
		
		////////Delegacion 3/////////
		Dep2.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","balfemenino","baloncesto"));
		Dep2.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","balfemenino","baloncesto"));
		
		categorias2.add(new Categoria("balfemenino",true,false,Dep2));
		
		Disciplinas.add(new Disciplina(categorias2,"baloncesto"));
		
		return Disciplinas;
	}
	
	public static void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}
	
	public static ArrayList<Juez> getJueces() {
		return Jueces;
	}
	
	public void setJueces(ArrayList<Juez> jueces) {
		Jueces = jueces;
	}
	
	public static ArrayList<Deportista> getDeportistas() 
	{   
		ArrayList<Deportista> Dep3=new ArrayList<> ();
	
		Deportistas.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria","100metros","atletismo"));
		Deportistas.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria","100metros","atletismo"));
		Deportistas.add(new Deportista(3,"Mariana Duque",true,123f,true,"Ingenieria","100metros","atletismo"));
		Deportistas.add(new Deportista(4,"Fernando Far",true,123f,false,"Ingenieria","100metros","atletismo"));
		Deportistas.add(new Deportista(5,"Samuel Guitierrez",false,123f,false,"Ingenieria","100metros","atletismo"));;
		Deportistas.add(new Deportista(6,"Santiago Castro",false,123f,false,"Medicina","100metros","atletismo"));
		Deportistas.add(new Deportista(7,"Pablo Suarez",true,123f,false,"Medicina","100metros","atletismo"));
		Deportistas.add(new Deportista(8,"Melany Rizo",true,123f,true,"Medicina","100metros","atletismo"));
		Deportistas.add(new Deportista(9,"Fernando Aristizabal",true,123f,false,"Medicina","100metros","atletismo"));
		Deportistas.add(new Deportista(10,"Samuel Paez",false,123f,false,"Medicina","100metros","atletismo"));
		Deportistas.add(new Deportista(11,"Pedro Piedra",false,123f,false,"CEA","100metros","atletismo"));
		Deportistas.add(new Deportista(12,"Salomon Garcia",true,123f,false,"CEA","100metros","atletismo"));
		Deportistas.add(new Deportista(13,"Melany PAPA",true,123f,true,"CEA","100metros","atletismo"));
		Deportistas.add(new Deportista(14,"Sophie fifi",true,123f,false,"CEA","100metros","atletismo"));
		
		return Deportistas;
	}

	public static void setDeportistas(ArrayList<Deportista> deportistas) {
		Deportistas = deportistas;
	}

	
	
	
	
	public static void EditarDeportista(Integer id, String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String delegacionPertenece, String categoriaPertenece,String disciplinaPertenece)
	{
		getDisciplinas();
		getDelegaciones();
		
		ActualizarDeportistaDelegacion(id,nombre, asistenciaPrimeraVez, estatura,
				abanderado,delegacionPertenece);
		
		ActualizarDeportistaCategoria(id,nombre, asistenciaPrimeraVez, estatura,
				abanderado,categoriaPertenece,disciplinaPertenece);
		
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
	public static void ActualizarDeportistaCategoria(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String categoriaPertenece,String disciplinaPertenece)
	{
		for(Disciplina disp: Disciplinas)
		{
			
			if(disp.getDisciplina().equals(disciplinaPertenece))
			{
				disp.actualizarDeportista(id, nombre, asistenciaPrimeraVez, estatura, abanderado, categoriaPertenece);
			}
		}
	}
	public static void ActualizarDeportistaDelegacion(Integer id,String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String delegacionPertenece)
	{
		
		for(Delegacion del: Delegaciones)
		{
			if(del.getFacultad().equals(delegacionPertenece))
			{
				//System.out.println("si");
				del.ActualizarDeportista(id,nombre, asistenciaPrimeraVez, estatura,
						abanderado);
			}
		}
	}
	
	
	public static Boolean AnadirDelegacion()
	{
		return true;
	}
	
	public static Boolean BuscarDelegacion()
	{
		return true;
	}
	
	
	public static Boolean AnadirDeportista()
	{
	
		return true;
	}
	public static Boolean EliminarDeportista()
	{
		return true;
	}
	
	
	
	public static Deportista BuscarDeportista(Integer NoInscripcion)
	{
		Deportista encontrado=null;
		
		getDeportistas();
		
		for(Deportista dep: Deportistas)
		{
			if(dep.getNoInscripcion()==NoInscripcion)
			{
				encontrado=dep;
			}
		}
		
		return encontrado;
	}
	/*
	public static String BuscarCategoriaDeportista(Integer NoInscripcion)
	{
		
		getDeportistas();
		
		String nombreCategoria;
		
		for(Disciplina disp: Disciplinas)
		{
			String encontrado=disp.buscarCategoriaDeportista(NoInscripcion);
			if(encontrado!="")
			{
				return encontrado;
			}
			
		}
		
		return "";
	}*/
	
	public static Boolean BuscarDeportistaDeDelegacion()
	{
		return true;
	}
	
	public static Boolean BuscarDeportistaDeCategoria()
	{
		return true;
	}
	
	public static ArrayList<Deportista> ObtenerDeportistasDeDelegacion()
	{
		ArrayList<Deportista> k=new ArrayList<Deportista>();
		return k;
	}
	
	public static ArrayList<Deportista> ObtenerDeportistasDeCategoria()
	{
		ArrayList<Deportista> k=new ArrayList<Deportista>();
		return k;
	}
	
	
	
	public static Boolean AnadirCategoria()
	{
		return true;
	}
	
	public static Boolean BuscarCategoria()
	{
		return true;
	}
	public static ArrayList<Categoria> ObtenerCategoriasDeDisciplina(String nombreDisciplina)
	{
		ArrayList<Categoria> k=new ArrayList<Categoria>();
		return k;
	}
	
	
	public static Boolean AnadirDisciplina()
	{
		return true;
	}
	public static Boolean BuscarDisciplina()
	{
		return true;
	}
	public static ArrayList<Disciplina> ObtenerDisciplinas()
	{
		ArrayList<Disciplina> k=new ArrayList<Disciplina>();
		return k;
	}
	
	
}
