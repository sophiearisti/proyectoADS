package Modelo;

import java.util.ArrayList;

public class Olimpiada 
{
	private static Delegaciones ListaDelegaciones=new Delegaciones();
	private static Deportistas ListaDeportistas=new Deportistas();
	private static Disciplinas disciplinasList=new Disciplinas();
	private static Jueces ListaJueces=new Jueces();
	
	public static ArrayList<Delegacion> getDelegaciones() {
		
		return ListaDelegaciones.getDelegacionesList();
		
		/*ArrayList<Delegacion> prueba=new ArrayList<Delegacion> ();
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
		
		return prueba;*/
	}
	
	public static void setDelegaciones(ArrayList<Delegacion> delegaciones) {
		ListaDelegaciones.setDelegacionesList(delegaciones);
	}
	
	public static ArrayList<Disciplina> getDisciplinas() 
	{
		return disciplinasList.getDisciplinasList(); 
		/*ArrayList<Categoria> categorias1=new ArrayList<Categoria> ();
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
		
		return Disciplinas;*/
	}
	
	public static void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		disciplinasList.setDisciplinasList(disciplinas);
	}
	
	public static ArrayList<Juez> getJueces() {
		return ListaJueces.getJueces();
	}
	
	public void setJueces(ArrayList<Juez> jueces) {
		ListaJueces.setJueces(jueces);
	}
	
	public static ArrayList<Deportista> getDeportistas() 
	{ 
		return ListaDeportistas.getDeportistasList();
		
		/*ArrayList<Deportista> Dep3=new ArrayList<> ();
	
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
		
		return Deportistas;*/
	}

	public static void setDeportistas(ArrayList<Deportista> deportistas) {
		ListaDeportistas.setDeportistasList(deportistas);
	}

	
	
	public static void EditarDeportista(Integer id, String nombre, Boolean asistenciaPrimeraVez, Float estatura,
			Boolean abanderado,String delegacionPertenece, String categoriaPertenece,String disciplinaPertenece)
	{
		getDisciplinas();
		getDelegaciones();
		
		ListaDelegaciones.ActualizarDeportistaDelegacion(id,nombre, asistenciaPrimeraVez, estatura,
				abanderado,delegacionPertenece);
		
		disciplinasList.ActualizarDeportistaCategoria(id,nombre, asistenciaPrimeraVez, estatura,
				abanderado,categoriaPertenece,disciplinaPertenece);
		
		
		ListaDeportistas.EditarDeportista(id, nombre, asistenciaPrimeraVez, estatura, abanderado, delegacionPertenece, categoriaPertenece, disciplinaPertenece);	
	}
	
	public static Boolean AnadirDelegacion()
	{
		if(BuscarDelegacion())
		{
			
		}
		
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
		Deportista encontrado=ListaDeportistas.BuscarDeportista(NoInscripcion);
		
		return encontrado;
	}
	
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
		if( BuscarCategoria())
		{
			
		}
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
		if(BuscarDisciplina())
		{
			
		}
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
