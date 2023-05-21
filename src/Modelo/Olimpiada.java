package Modelo;

import java.util.ArrayList;

public class Olimpiada 
{
	private static ArrayList<Delegacion> Delegaciones;
	private static ArrayList<Disciplina> Disciplinas;
	private static ArrayList<Juez> Jueces;
	private static ArrayList<Deportista> Deportistas;
	
	
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
		Dep3.add(new Deportista(1,"Juan Paez",false,123f,false,"Ingenieria"));
		Dep3.add(new Deportista(2,"Laura Pinto",true,123f,false,"Ingenieria"));
		Dep3.add(new Deportista(1,"Mariana Duque",true,123f,true,"Ingenieria"));
		Dep3.add(new Deportista(1,"Fernando Far",true,123f,false,"Ingenieria"));
		Dep3.add(new Deportista(1,"Samuel Guitierrez",false,123f,false,"Ingenieria"));
		
		prueba.add(new Delegacion("Ingenieria","Pablo Suarez",Dep3.size(),Dep3));
		
		/////////Delegacion 2/////////
		Dep.clear();
		Dep1.add(new Deportista(1,"Santiago Castro",false,123f,false,"Medicina"));
		Dep1.add(new Deportista(2,"Pablo Suarez",true,123f,false,"Medicina"));
		Dep1.add(new Deportista(1,"Melany Rizo",true,123f,true,"Medicina"));
		Dep1.add(new Deportista(1,"Fernando Aristizabal",true,123f,false,"Medicina"));
		Dep1.add(new Deportista(1,"Samuel Paez",false,123f,false,"Medicina"));
		
		prueba.add(new Delegacion("Medicina","Pablo Suarez",Dep1.size(),Dep1));
		
		
		////////Delegacion 3/////////
		Dep.clear();
		Dep2.add(new Deportista(1,"Pedro Piedra",false,123f,false,"CEA"));
		Dep2.add(new Deportista(2,"Salomon Garcia",true,123f,false,"CEA"));
		Dep2.add(new Deportista(1,"Melany PAPA",true,123f,true,"CEA"));
		Dep2.add(new Deportista(1,"Sophie fifi",true,123f,false,"CEA"));
		
		prueba.add(new Delegacion("CEA","Pablo Suarez",Dep2.size(),Dep2));
		
		
		return prueba;
	}
	public static void setDelegaciones(ArrayList<Delegacion> delegaciones) {
		Delegaciones = delegaciones;
	}
	public static ArrayList<Disciplina> getDisciplinas() {
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
	
	
	public static Boolean AnadirDelegacion()
	{
		return true;
	}
	
	public static Boolean BuscarDelegacion()
	{
		return true;
	}
	public static ArrayList<Delegacion> ObtenerDelegacion()
	{
		ArrayList<Delegacion> k=new ArrayList<Delegacion>();
		return k;
	}
	
	
	public static Boolean AnadirDeportista()
	{
	
		return true;
	}
	public static Boolean EliminarDeportista()
	{
		return true;
	}
	public static Boolean EditarDeportista()
	{
		return true;
	}
	
	
	public static Deportista BuscarDeportista(Integer NoInscripcion)
	{
		Deportista m=new Deportista();
		return m;
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
